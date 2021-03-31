import java.util.ArrayList;

/**
 * @author Shawn Velsor
 * @version 3/8/2021
 * 
 *
 */

public class GradebookTester {

    // initialize global arraylist
    // Just learned
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student("Suzie Lou", new Double[] { 72.6, 80.8, 81.4, 79.0, 80.4 }));
        students.add(new Student("Jackie Chan", new Double[] { 84.0, 85.2, 73.4, 81.0, 94.4 }));
        students.add(new Student("Leroy Jenkins", new Double[] { 87.6, 94.8, 81.4, 95.0, 78.9 }));
        students.add(new Student("Nicholas Cage", new Double[] { 87.6, 85.2, 81.4, 95.0, 72.4 }));
        students.add(new Student("Dean Winchester", new Double[] { 87.6, 94.8, 81.4, 95.0, 72.4 }));

        ShowStudentGrades();
        ReplaceName(2, "Slim Shady");
        ShowStudentGrades();
        ReplaceGrade(3, 3, 72, 100);
        ShowStudentGrades();
        AddStudent(new Student("Matt Damon", new Double[] {72.66, 41.25, 88.99, 99.99, 100.00}));
        ShowStudentGrades();
        insertStudent(2, new Student("Vin Diesel", new Double[] {88.42, 83.26, 42.44, 45.99, 56.98}));
        ShowStudentGrades();
        deleteStudent("Suzie Lou");
        ShowStudentGrades();

    }

    static void ShowStudentGrades() {
        System.out.printf("%n%n");
        System.out.printf("%20s%n", "Gradebook");
        System.out.printf("%-20s%5s%7s%7s%7s%7s%n", "Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("======================================");

        for (Student student : students) {
            System.out.printf("%-20s ", student.getName());
            for (int i = 0; i < student.getQuizCount(); i++) {
                // Ran into 2 problems, inadvetantly fixed both of them at the same time.
                // Need to stop oversimplifying.
                if (i != 0) {
                    System.out.print(", ");
                }
                System.out.printf("%3.2f", student.getGrade(i));
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ReplaceName(int i, String name) {
        System.out.printf("Replacing student name %s with name %s%n", students.get(i).getName(), name);
        students.get(i).setName(name);
    }

    public static void ReplaceGrade(int student, int quiz, int grade, int totalPoints) {
        quiz = quiz - 1;

        System.out.printf("Replacing %s's quiz # %d with new quiz grade: %3d/%3d", students.get(student).getName(),
                quiz, grade, totalPoints);
        students.get(student).setGrade(quiz, grade, totalPoints);
    }

    public static void AddStudent(Student newStudent) {
        System.out.printf("Adding new student %s%n", newStudent.getName());
        students.add(newStudent);
    }

    public static void insertStudent(int idx, Student newStudent) {
        System.out.printf("Inserting new student %s at index %d%n", newStudent.getName(), idx);
        ArrayList<Student> insertedArray = new ArrayList<>();
        int i = 0;
        for(Student student : students){
            if(i == idx)
                insertedArray.add(newStudent);
            else
                insertedArray.add(student);
        }

        students = insertedArray;
    }

    public static void deleteStudent(String name) {
        System.out.printf("Deleting student with name %s%n", name);
        Student studentToDelete = null;
        for(Student student : students){
            if(student.getName().equals(name))
                studentToDelete = student;
        }
        if(studentToDelete != null)
            students.remove(studentToDelete);
    }

 
}
