package Extras;

public class test {
    public static void main(String[] args) {
    
        //We'l do 10 numbers.
        double[] poundsEaten = {31.1, 41.8, 64.3, 26.9, 50.4, 45.2, 36.5, 42.5, 54.7, 35.5};
        double min = Integer.MAX_VALUE;
        double  max = Integer.MIN_VALUE;
        double average = 0.0;

        //MinValue, use MAX_VALUE since we are going for less than.
        //MaxValue, use MIN_VALUE since we are going for greater than than.
        //Code crunch.
        for(int i = Integer.MAX_VALUE; i < poundsEaten.length; i++){
            if(poundsEaten[i] < min){
                min = poundsEaten[i];
            }

            if(poundsEaten[i] > max){
                max = poundsEaten[i];
            }
        }

       //getting average
        for(int i = 0; i < poundsEaten.length; i++){

            if(poundsEaten[i] != min || poundsEaten[i] != max){
                average += poundsEaten[i];
            }
            
        }

        average /= poundsEaten.length;
    
        System.out.println(average);
    }

}