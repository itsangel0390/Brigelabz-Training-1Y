import java.util.Scanner;

public class ChocolateDivision {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;   // quotient: chocolates each child gets
        result[1] = number % divisor;   // remainder: chocolates left
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        // Input number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Check for valid input
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than 0.");
        } else {
            // Call the method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
