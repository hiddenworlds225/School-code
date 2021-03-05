package Elections_7_06;

import java.util.ArrayList;

/*
 * Modified from V3 file
*/

public class ElectionTesterV4 {
    public static void main(String[] args) {

        // Initalize arraylist of candidates
        ArrayList<Candidate> candidates = new ArrayList<>();

        candidates.add(new Candidate("Matt Damon", 16870));
        candidates.add(new Candidate("Bob Ross", 99385));
        candidates.add(new Candidate("Peter Parker", 32658));
        candidates.add(new Candidate("Obama (Last Name?)", 24386));
        candidates.add(new Candidate("Homer Simpson", 65413));
        

        System.out.println("Raw Data:\n");

        // counting all votes while presenting candidates.

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

    public static void DisplayResults(ArrayList<Candidate> candidates, int totalVotes) {
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


    // Replacement functions
    public static void ReplaceName(ArrayList<Candidate> candidates) {

        System.out.println();
        System.out.println("<<Changing Obama (Last Name?) to Spongebob>>");

        for(Candidate candidate : candidates){
            if(candidate.getName().indexOf("Obama") != -1){
                candidate.setName("Spongebob");
            }
        }
    }

    public static void ReplaceVotes(ArrayList<Candidate> candidates){
        System.out.println();
        System.out.println("<<Changing Peter Parker votes to 12000>>");

        for(Candidate candidate : candidates){
            if(candidate.getName().indexOf("Peter") != -1){
                candidate.setVotes(12000);
            }
        }
        
    }

    
    public static void ReplaceCandidate(ArrayList<Candidate> candidates) {
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
