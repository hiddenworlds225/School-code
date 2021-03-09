package Gradebook;

import java.util.ArrayList;

/**
 * @author Shawn Velsor
 * @version 3/8/2021 
 * 
 *
*/


public class GradebookTester {
    public static void main(String[] args) {
        // Initialize arraylist
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Suzie Lou", new Double[] {87.6, 94.8, 81.4, 95.0, 72.4}));
        students.add(new Student("Jackie Chan", new Double[] {84.0, 85.2, 73.4, 81.0, 77.4}));
        students.add(new Student("Leroy Jenkins", new Double[] {87.6, 94.8, 81.4, 95.0, 72.4}));
        students.add(new Student("Nicholas Cage", new Double[] {87.6, 94.8, 81.4, 95.0, 72.4}));
        students.add(new Student("Dean Winchester", new Double[] {87.6, 94.8, 81.4, 95.0, 72.4}));
    }
}
