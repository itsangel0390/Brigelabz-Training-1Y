import java.util.Scanner;

public class DistanceAndLineEquation {

    // Method to calculate Euclidean distance between two points
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line (slope and y-intercept) given two points
    // Returns array: [slope, y-intercept]
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope;
        double yIntercept;

        if (x2 - x1 != 0) { // Non-vertical line
            slope = (y2 - y1) / (x2 - x1);
            yIntercept = y1 - slope * x1;
        } else { // Vertical line, slope is infinite
            slope = Double.POSITIVE_INFINITY;
            yIntercept = Double.NaN; // No y-intercept
        }

        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between points: %.2f%n", distance);

        // Calculate line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        if (Double.isInfinite(line[0])) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of line: y = %.2fx + %.2f%n", line[0], line[1]);
        }

        sc.close();
    }
}
