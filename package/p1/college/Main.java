import college.student.student;
import college.faculty.saculty;

public class Main {
    public static void main(String[] args) {
        student s1 = new student("Ayush", 15);
        faculty f1 = new faculty("Batika", "Computer Science");

        System.out.println("--- Student Details ---");
        s1.display();

        System.out.println("\n--- Faculty Details ---");
        f1.display();
    }
}
