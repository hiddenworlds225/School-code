
import java.util.Arrays;

/**
 * 7.06 extra challenge
 * 
 * @author Shawn Velsor
 * @version 3/8/2021
 */
public class Student {

    private String name;
    private Double[] grades;

    public Student(String name, Double[] grades) {

        this.name = name;
        this.grades = grades;
    }

    public void setName(String str) {
        name = str;
    }

    public void setGrade(int quiz, int points, int totalPoints) {
        grades[quiz] = (double) points / totalPoints;
    }

    public String getName() {
        return name;
    }

    public double getGrade(int quiz) {
        return grades[quiz];
    }

    public void addQuiz(Double score) {
        Double[] newGrades;
        newGrades = Arrays.copyOf(grades, grades.length + 1);
        newGrades[newGrades.length - 1] = score;
    }

    public int getQuizCount() {

        return grades.length;
    }

    public String toString(){
        return String.format("%-30s \t %2.2f %2.2f %2.2f %2.2f %2.2f", getName(), getGrade(0), getGrade(1), 
        getGrade(2), getGrade(3), getGrade(4));
    }

}