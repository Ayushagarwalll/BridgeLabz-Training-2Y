public class Student {
    String name;
    int rollNumber;
    double marks;

   public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
       Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

         student1.name = "Ayush";
        student1.rollNumber = 101;
        student1.marks = 85.5;

        student2.name = "Kavy";
        student2.rollNumber = 102;
        student2.marks = 72.0;

        student3.name = "Sohum";
        student3.rollNumber = 103;
        student3.marks = 58.5;

         System.out.println("Student 1 details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 details:");
        student2.displayDetails();

        System.out.println("\nStudent 3 details:");
        student3.displayDetails();
    }
}
