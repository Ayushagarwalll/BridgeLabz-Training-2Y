import java.util.*;
public class Employee
{
    String name="Ayush";
    int id=15;
    double salary=180000;

    public void displayEmployee(){
        System.out.println("Employee Name="+name);
        System.out.println("Employee id="+id);
        System.out.println("Employee Salary="+salary);
        }
        public static void main(String[] args)
        {
            Employee emp=new Employee();
            
            emp.displayEmployee();

        }
}