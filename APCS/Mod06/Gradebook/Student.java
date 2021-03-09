package Gradebook;

import java.util.ArrayList;

/**
 * 7.06 extra challenge
 * 
 * @author Shawn Velsor
 * @version 3/8/2021
 */
public class Student {

    String name;
    int quizNumber;
    Double[] grades;


    public Student(String name, Double[] grades){

        this.name = name;
        this.grades = grades;
    }

    public void setName(String str){
        name = str;
    }

    public void setGrade(int quiz, int points, int totalPoints){
        grades[quiz] = (double) points / totalPoints;
    }

    public String getName(){
        return name;
    }

    public double getGrade(int quiz){
        return grades[quiz];
    }

    public String toString(){
        return String.format("%s has %d quizes that average %2.2f", name, grades.length, average());
    }

    private double average(){
        double total = 0.0;
        for(double grade : grades){
            total += grade;
        }
        return total / grades.length;
    }

}