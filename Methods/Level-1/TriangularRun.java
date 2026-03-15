import java.util.Scanner;

public class TriangularRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3, double totalDistanceMeters) {
        double perimeter = side1 + side2 + side3; // Perimeter of the triangle
        return totalDistanceMeters / perimeter;   // Number of rounds
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the sides of the triangular park
        System.out.print("Enter side 1 of the triangle (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (meters): ");
        double side3 = sc.nextDouble();

        // Total distance to run = 5 km = 5000 meters
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = calculateRounds(side1, side2, side3, totalDistance);

        // Display the result
        System.out.printf("The athlete must complete %.2f rounds to run 5 km.\n", rounds);

        sc.close();
    }
}
