import java.util.Scanner;

class PalindromeChecker {
    String text;

    // Method to check palindrome
    boolean isPalindrome() {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        if (text.equals(reversed))
            return true;
        else
            return false;
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println("The text is a Palindrome.");
        else
            System.out.println("The text is NOT a Palindrome.");
    }
}

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeChecker pc = new PalindromeChecker();

        System.out.print("Enter a text: ");
        pc.text = sc.nextLine();

        pc.displayResult();
    }
}
