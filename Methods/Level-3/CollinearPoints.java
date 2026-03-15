import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Optional: Method to check collinearity using area of triangle formula
    // If area formed by three points is 0, they are collinear
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates
        System.out.println("Enter coordinates of point A (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates of point B (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter coordinates of point C (x3 y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check collinearity using slope
        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Slope Method)? " + collinearSlope);

        // Check collinearity using area
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear (Area Method)? " + collinearArea);

        sc.close();
    }
}
