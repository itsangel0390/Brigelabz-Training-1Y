import java.util.Scanner;

public class FactorAnalyzer {

    // Method to find factors and return as an array
    public static int[] findFactors(int number) {
        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to calculate sum of square of factors
    public static int sumOfSquareOfFactors(int[] factors) {
        int sumSquare = 0;
        for (int f : factors) {
            sumSquare += Math.pow(f, 2);
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Find factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors of " + number + ": ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();

            // Calculate sum, product, and sum of squares
            int sum = sumOfFactors(factors);
            long product = productOfFactors(factors);
            int sumSquares = sumOfSquareOfFactors(factors);

            // Display results
            System.out.println("Sum of factors: " + sum);
            System.out.println("Product of factors: " + product);
            System.out.println("Sum of squares of factors: " + sumSquares);
        }

        sc.close();
    }
}
