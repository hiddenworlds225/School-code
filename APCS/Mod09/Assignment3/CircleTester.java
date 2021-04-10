package Assignment3;

import java.util.ArrayList;

/**
 * Circle Tester: Used to test circles
 * @author Shawn Velsor
 * @version 4/9/2021
 */

public class CircleTester {
    public static void main(String[] args) {
        ArrayList<Circle2> cList = new ArrayList<>();
        cList.add(new Circle2(5, 5, 3));
        cList.add(new OvalCylinder2(10, 12, 8, 8, 15));
        cList.add(new Cylinder2(5, 10, 6, 12));
        cList.add(new Oval2(7, 9, 5, 6));

        for(Circle2 circle: cList){
            System.out.println("For this " + circle.getName() + " the center is at " + showCenter(circle));
        }
    }

    public static String showCenter(Circle2 circle){
        return circle.getCenter();
    }
}
