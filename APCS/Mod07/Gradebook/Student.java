package Gradebook;


/**
 * 7.06 extra challenge
 * 
 * @author Shawn Velsor
 * @version 3/8/2021
 */
public class Student {

    private String name;
    private int quizNumber;
    private Double[] grades;


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

    public void addQuiz(double score){
        double[] newGrades = new double[grades.length + 1];
        for (int i = 0; i < grades.length; i++) {
            newGrades[i] = grades[i];
        }
        newGrades[newGrades.length - 1] = score;
    }

    public int getQuizCount(){

        return grades.length;
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