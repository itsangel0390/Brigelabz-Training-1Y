import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees); // Convert degrees to radians
        double[] results = new double[3];
        results[0] = Math.sin(angleRadians); // sine
        results[1] = Math.cos(angleRadians); // cosine
        results[2] = Math.tan(angleRadians); // tangent
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Call the method
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine(%.2f°) = %.4f\n", angle, trigValues[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, trigValues[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, trigValues[2]);

        sc.close();
    }
}
