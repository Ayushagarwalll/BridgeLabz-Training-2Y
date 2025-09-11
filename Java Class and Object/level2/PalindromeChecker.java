import java.util.Scanner;

public class PalindromeChecker {
    String text;

    public boolean checkPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); 
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   public void displayResult() {
        if (checkPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter text to check for palindrome: ");
        checker.text = scanner.nextLine();

        checker.displayResult();

        scanner.close();
    }
}
