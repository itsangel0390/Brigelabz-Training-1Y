import java.util.Scanner;

public class FactorAnalysis {

    // Method to find factors of a number and return as array
    public static int[] findFactors(int number) {
        // First loop: count the factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Second loop: store factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > greatest) {
                greatest = f;
            }
        }
        return greatest;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find the product of the cube of factors
    public static long productOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors of " + number + ": ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();

            // Greatest factor
            System.out.println("Greatest factor: " + greatestFactor(factors));

            // Sum of factors
            System.out.println("Sum of factors: " + sumOfFactors(factors));

            // Product of factors
            System.out.println("Product of factors: " + productOfFactors(factors));

            // Product of cubes of factors
            System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));
        }

        sc.close();
    }
}