package Elections_7_07;

import java.util.ArrayList;

public class ElectionTesterV8 {
    public static void main(String[] args) {

        // Initalize arraylist of candidates
        ArrayList<Candidate> candidates = new ArrayList<>();

        candidates.add(new Candidate("Matt Damon", 16870));
        candidates.add(new Candidate("Bob Ross", 99385));
        candidates.add(new Candidate("Peter Parker", 32658));
        candidates.add(new Candidate("Obama (Last Name?)", 24386));
        candidates.add(new Candidate("Homer Simpson", 65413));
        

        System.out.println("Raw Data:\n");

        // Upgraded vote counting.

        for(Candidate candidate : candidates){
            PrintStatement(candidate);
        }

        // Give some space for results
        System.out.println();
        System.out.println();

        System.out.println("Original results:");
        //Print formatted data
        DisplayResults(candidates);

        RemoveCandidate(candidates, "Matt Damon");

        DisplayResults(candidates);

        RemoveCandidate(candidates, "Homer Simpson");

        DisplayResults(candidates);

       
    }

    public static void PrintStatement(Candidate candidate){
        System.out.println(candidate.toString());
    }

    public static void DisplayResults(ArrayList<Candidate> candidates) {
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

    public static int TotalVotes(ArrayList<Candidate> candidates) {
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

    //Deletion function
    public static ArrayList<Candidate> RemoveCandidate(ArrayList<Candidate> candidates, String name) {
        System.out.println();
        System.out.printf("<<Deleting candidate %s.>>%n", name);

        for(Candidate candidate : candidates){
            if(candidate.getName().equalsIgnoreCase(name)){
                candidates.remove(candidate);
                return candidates;
            }
        }


        return candidates;
        
    }
  
    
}
