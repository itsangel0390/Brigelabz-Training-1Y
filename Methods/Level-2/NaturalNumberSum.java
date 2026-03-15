import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n + sumRecursive(n - 1); // Recursive call
        }
    }

    // Method to find sum using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (>0).");
        } else {
            // Calculate sum using recursion
            int recursiveSum = sumRecursive(n);

            // Calculate sum using formula
            int formulaSum = sumFormula(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursiveSum);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + formulaSum);

            // Compare results
            if (recursiveSum == formulaSum) {
                System.out.println("Both methods give the same result. ✅");
            } else {
                System.out.println("The results do not match. ❌");
            }
        }

        sc.close();
    }
}
