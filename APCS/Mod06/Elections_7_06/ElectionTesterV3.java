package Elections_7_06;

/*
 *  7.05
 *  replacing through arrays and arraylists
 * 
 * @Author Shawn Velsor
 * @Date 2/12/2021 
 * 
 * NOTE: This folder needs a bit of rework. Please refer to ElectionTester V7 & V8 for updated functions.
 * 
*/



public class ElectionTesterV3 {
    public static void main(String[] args) {

        // Initalize array of candidates
        Candidate[] candidates  = {new Candidate("Matt Damon", 16870), new Candidate("Bob Ross", 99385),
        new Candidate("Peter Parker", 32658), new Candidate("Obama (Last Name?)", 24386),
        new Candidate("Homer Simpson", 65413)};

        System.out.println("Raw Data:\n");

        // I guess we can count up all of the votes during the raw data processing so we can get
        // percentage 

        int totalVotes = 0;

        for(Candidate candidate : candidates){
            PrintStatement(candidate);
            totalVotes += candidate.getVotes();
        }

        // Give some space for results
        System.out.println();
        System.out.println();

        System.out.println("Original results:");
        //Print formatted data
        DisplayResults(candidates, totalVotes);

        ReplaceName(candidates);

        DisplayResults(candidates, totalVotes);

        ReplaceVotes(candidates);

        DisplayResults(candidates, totalVotes);

        ReplaceCandidate(candidates);

        DisplayResults(candidates, totalVotes);
    }

    public static void PrintStatement(Candidate candidate){
        System.out.println(candidate.toString());
    }

    public static void DisplayResults(Candidate[] candidates, int totalVotes) {
        System.out.printf("%25s%n", "Election Results:");
        System.out.printf("%-20s%-10s%s%n", "Names:", "Votes:", "% of votes:");
        System.out.println("=================================");

        for (Candidate candidate : candidates) {
            System.out.printf("%-20s%-10d%-10.2f%n", candidate.getName(), candidate.getVotes(), (GetPercent(candidate.getVotes(), totalVotes) * 100));
        }

        System.out.println();
        System.out.println("Total amount of votes is " + totalVotes + " votes.");

    }

    //Get percentage of votes recieved out of total
    public static double GetPercent(int votes, int totalVotes){

        return (double) votes / totalVotes;

    }

      // These are the new functions for replacements and stuff
    public static void ReplaceName(Candidate[] candidates) {

        System.out.println();
        System.out.println("<<Changing Obama (Last Name?) to Spongebob>>");

        for(Candidate candidate : candidates){
            if(candidate.getName().indexOf("Obama") != -1){
                candidate.setName("Spongebob");
            }
        }
    }

    public static void ReplaceVotes(Candidate[] candidates){
        System.out.println();
        System.out.println("<<Changing Peter Parker votes to 12000>>");

        for(Candidate candidate : candidates){
            if(candidate.getName().indexOf("Peter") != -1){
                candidate.setVotes(12000);
            }
        }
        
    }

    public static void ReplaceCandidate(Candidate[] candidates) {
        System.out.println();
        System.out.println("<<Replacing Homer Simpson with Miachael Jackson for 14000 votes>>");

        for(Candidate candidate : candidates){
            if(candidate.getName().indexOf("Homer") != -1){
                candidate.setName("Miachael Jackson");
                candidate.setVotes(14000);
            }
        }
        
    }



}