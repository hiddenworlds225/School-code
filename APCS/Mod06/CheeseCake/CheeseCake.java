package CheeseCake;

/*
    Object class for 7.02
*/


public class CheeseCake {
    //Pre-Set variables for calculations, set here for easy modification.
    private int servings = 16;
    private int ounceCreamCheese = 32;
    private double cupSugar = 1.0/3;
    private int tspVanila = 1;

    //user driven variables
    private int quantity;
    private String flavor;

    //Final results, can be requested by the user in the code
    private int totalServings; 
    private int totalCreamCheese;
    private double totalCupSugar;
    private int totalTspVanilla;

    public CheeseCake(String flavor, int quantity){
        this.quantity = quantity;
        this.flavor = flavor;
    }

    //Just a quck way without having to do it bit by bit.
    public void calcAllData(){
        calcCreamCheese();
        calcSugar();
        calcTotalServings();
        calcVanila();
    }


    public void calcTotalServings(){
        totalServings = quantity * servings;
    }
    public void calcCreamCheese(){
        totalCreamCheese = quantity * ounceCreamCheese;
    }
    public void calcSugar(){
        totalCupSugar = quantity * cupSugar;
    }
    public void calcVanila(){
        totalTspVanilla = quantity * tspVanila;
    }

    //Use these to get variables from the item in question.
    public int totalServings(){
        return totalServings;
    }

    public int totalCreamCheese(){
        return totalCreamCheese;
    }

    public double totalSugar(){
        return totalCupSugar;
    }

    public int totalVanilla(){
        return totalTspVanilla;
    }

    public String toString(int index){
        return String.format("|%4d   |%5d     | %-11s   |%8d oz   |%7d   | %2.2f  cups|   %d tsps  |", 
        index, quantity, flavor, totalCreamCheese, totalServings, totalCupSugar, totalTspVanilla);
    }
}
