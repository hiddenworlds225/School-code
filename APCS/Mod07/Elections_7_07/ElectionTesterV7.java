package Elections_7_07;

/*
 *  7.05
 *  replacing through arrays and arraylists
 * 
 * @Author Shawn Velsor
 * @Date 2/12/2021 
 * 
*/



public class ElectionTesterV7 {
    public static void main(String[] args) {

        // Initalize array of candidates
        Candidate[] candidates  = {new Candidate("Matt Damon", 16870), new Candidate("Bob Ross", 99385),
        new Candidate("Peter Parker", 32658), new Candidate("Obama (Last Name?)", 24386),
        new Candidate("Homer Simpson", 65413)};

        System.out.println("Raw Data:\n");

        // Upgraded Total Vote count; now call the function TotalVotes() to generate total

        for(Candidate candidate : candidates){
            PrintStatement(candidate);
        }

        // Give some space for results
        System.out.println();
        System.out.println();

        System.out.println("Original results:");
        //Print formatted data
        DisplayResults(candidates);

        candidates = DeleteCandidate("Homer Simpson", candidates);

        DisplayResults(candidates);

        candidates = DeleteCandidate("Matt Damon", candidates);

        DisplayResults(candidates);
    }

    public static void PrintStatement(Candidate candidate){
        System.out.println(candidate.toString());
    }

    public static void DisplayResults(Candidate[] candidates) {

        int totalVotes = TotalVotes(candidates);

        System.out.printf("%25s%n", "Election Results:");
        System.out.printf("%-20s%-10s%s%n", "Names:", "Votes:", "% of votes:");
        System.out.println("=================================");

        for (Candidate candidate : candidates) {
            System.out.printf("%-20s%-10d%-10.2f%n", candidate.getName(), candidate.getVotes(), (GetPercent(candidate.getVotes(), totalVotes) * 100));
        }

        System.out.println();
        System.out.println("Total amount of votes is " + totalVotes + " votes.");

    }

    public static int TotalVotes(Candidate[] candidates) {
        int x = 0;

        for(Candidate candidate : candidates){
            x += candidate.getVotes();
        }

        return x;
    }

    //Get percentage of votes recieved out of total
    public static double GetPercent(int votes, int totalVotes){

        return (double) votes / totalVotes;

    }

    //Deletion Method; for Array

    public static Candidate[] DeleteCandidate(String name, Candidate[] candidates) {
        System.out.println();
        System.out.printf("<<Deleting candidate %s.>>%n", name);

        Candidate[] arr = candidates;

        for (int i = 0; i < candidates.length; i++){

            if(candidates[i].getName().equalsIgnoreCase(name)){

                arr = new Candidate[candidates.length - 1];

                int y = 0;
                for (int x = 0; x < candidates.length; x++){
                    if(x != i){
                        arr[y] = candidates[x];
                        y++;
                    }
                }
            }
        }

        return arr;
    }

    // Quick debug method.
    public static void print(String x) {
        System.out.println(x);
    }

}