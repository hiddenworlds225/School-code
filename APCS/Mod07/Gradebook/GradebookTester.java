package Gradebook;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;

/**
 * @author Shawn Velsor
 * @version 3/8/2021 
 * 
 *
*/


public class GradebookTester {

    //initialize global arraylist
    //Just learned 
    public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        students.add(new Student("Suzie Lou", new Double[] {72.6, 80.8, 81.4, 79.0, 80.4}));
        students.add(new Student("Jackie Chan", new Double[] {84.0, 85.2, 73.4, 81.0, 94.4}));
        students.add(new Student("Leroy Jenkins", new Double[] {87.6, 94.8, 81.4, 95.0, 78.9}));
        students.add(new Student("Nicholas Cage", new Double[] {87.6, 85.2, 81.4, 95.0, 72.4}));
        students.add(new Student("Dean Winchester", new Double[] {87.6, 94.8, 81.4, 95.0, 72.4}));

        for(Student student : students){
            System.out.println(student.toString());
        }

        
        ShowStudentGrades();
        ReplaceName(2, "Slim Shady");
        ShowStudentGrades();




    }

    static void ShowStudentGrades(){
        System.out.printf("%n%n");
        System.out.printf("%20s%n", "Gradebook");
        System.out.printf("%s%30s%n","Name:", "Grade(By quiz)");
        System.out.println("======================================");

        for(Student student : students){
            System.out.printf("%-20s ", student.getName());
            for(int i = 0; i < student.getQuizCount(); i++){
                //Ran into 2 problems, inadvetantly fixed both of them at the same time.
                //Need to stop oversimplifying.
                if(i != 0){
                    System.out.print(", ");
                }
                System.out.printf("%3.2f", student.getGrade(i));
            }
            System.out.printf("%n");
        }
    }


    static void ReplaceName(int i, String name){
        System.out.println("\n" + "Replacing name with " + name + "\n");
        students.get(i).setName(name);
    }

        static void ReplaceGrade(int i, int quiz, int grade, int totalPoints){
        System.out.println("\n" + "Replacing quiz" + quiz +" with " +  + "\n");
        students.get(i).setGrade(quiz, grade, totalPoints);
    }


    static void InsertStudent(Student newStudent){
        System.out.println("\n" + "Inserting name " + newStudent.getName() + "\n");
        students.add(newStudent);
    }
}
