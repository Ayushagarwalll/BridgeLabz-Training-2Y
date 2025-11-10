import static java.lang.Math.*;

public class MathDemo {
    public static void main(String[] args) {
        double num1 = 9.0;
        double num2 = -5.0;
        double num3 = 2.0;

        // Demonstrating five static methods
        System.out.println("Square root of " + num1 + " = " + sqrt(num1));
        System.out.println(num3 + " raised to power 3 = " + pow(num3, 3));
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + max(num1, num2));
        System.out.println("Minimum of " + num1 + " and " + num2 + " = " + min(num1, num2));
        System.out.println("Absolute value of " + num2 + " = " + abs(num2));
    }
}
