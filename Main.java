import java.util.*;
import java.sql.*;

// ---------------------- Student Class ----------------------
class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Course: " + course;
    }
}

// ---------------------- Database Manager ----------------------
class DatabaseManager {

    // EDIT THESE VALUES WITH YOUR DB DETAILS
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "yourpassword";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("❌ Database connection failed.");
            return null;
        }
    }

    // Insert Student into MySQL
    public static void addStudentToDB(Student s) {
        String q = "INSERT INTO students VALUES (?, ?, ?)";

        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(q)) {
            ps.setInt(1, s.id);
            ps.setString(2, s.name);
            ps.setString(3, s.course);

            ps.executeUpdate();
            System.out.println("✔ Student inserted into database.");

        } catch (Exception e) {
            System.out.println("❌ DB Insert Error: " + e.getMessage());
        }
    }

    // Delete student from DB
    public static void deleteStudentFromDB(int id) {
        String q = "DELETE FROM students WHERE id = ?";

        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(q)) {
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("✔ Student removed from database.");

        } catch (Exception e) {
            System.out.println("❌ DB Delete Error: " + e.getMessage());
        }
    }
}

// ---------------------- Main App ----------------------
public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== STUDENT RESULT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // ---------------------- Add Student ----------------------
    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student s = new Student(id, name, course);

        students.add(s);  // store in ArrayList
        DatabaseManager.addStudentToDB(s); // store in DB
        System.out.println("✔ Student added!");
    }

    // ---------------------- View Students ----------------------
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // ---------------------- Update Student ----------------------
    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {

                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new course: ");
                s.course = sc.nextLine();

                System.out.println("✔ Student updated!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // ---------------------- Delete Student ----------------------
    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        students.removeIf(s -> s.id == id);
        DatabaseManager.deleteStudentFromDB(id);

        System.out.println("✔ Student deleted.");
    }
}
