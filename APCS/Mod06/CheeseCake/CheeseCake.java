package CheeseCake;

public class CheeseCake {
    //Pre-Set variables for calculations, set here for easy modification.
    private int servings = 16;
    private int ounceCreamCheese = 32;
    private double cupSugar = 1/3;
    private int tspVanila = 1;

    //user driven variables
    private int quantity;
    private String flavor;

    //Final results, can be requested by the user in the code
    public int totalServings; 
    public int totalCreamCheese;
    public double totalCupSugar;
    public int totalTspVanilla;




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
}
