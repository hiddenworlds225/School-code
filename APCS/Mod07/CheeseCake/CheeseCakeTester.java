package CheeseCake;

/*
    Was going to say half of it was made by me, but its completely similar to the templates .-.

    7.02 ArrayLists II

    Expanding knowledge and use of ArrayLists

    @Shawn Velsor
    @2/4/2021

*/



import java.util.ArrayList;

public class CheeseCakeTester {
    public static void main(String[] args) {
        ArrayList<CheeseCake> cheeseCakes = new ArrayList<>();

        cheeseCakes.add(new CheeseCake("Blueberry", 5));
        cheeseCakes.add(new CheeseCake("Strawberry", 6));
        cheeseCakes.add(new CheeseCake("Cherry", 4));
        cheeseCakes.add(new CheeseCake("Jalanpeno", 1));
        cheeseCakes.add(new CheeseCake("Dill Pickle", 2));
        cheeseCakes.add(new CheeseCake("Fig", 3));

        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

         //using a for loop to print out the objects' data
         for(int i = 0; i < cheeseCakes.size(); i++)
         {

            //Use for smaller code, does the same thing
            //cheeseCakes.get(i).calcAllData();

            cheeseCakes.get(i).calcCreamCheese();
            cheeseCakes.get(i).calcTotalServings();
            cheeseCakes.get(i).calcSugar();
            cheeseCakes.get(i).calcVanila();
            System.out.printf("%s%n", cheeseCakes.get(i).toString(i));
         }
    }
}
