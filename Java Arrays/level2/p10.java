import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert number into digits array
        String numStr = Long.toString(number);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to int digit
        }

        // Frequency array of size 10 (for digits 0-9)
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        // Display frequencies
        System.out.println("\nDigit Frequency in number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " → " + freq[i] + " times");
            }
        }
    }
}
