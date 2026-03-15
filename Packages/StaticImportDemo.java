
import static java.lang.Math.*;  // Static import of all static members of Math class

public class StaticImportDemo {
    public static void main(String[] args) {
        double num1 = 16;
        double num2 = 4;

        // Using sqrt() - square root
        double root = sqrt(num1);
        System.out.println("Square root of " + num1 + " is: " + root);

        // Using pow() - power
        double power = pow(num1, num2);
        System.out.println(num1 + " raised to " + num2 + " is: " + power);

        // Using max() - maximum of two numbers
        double maximum = max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + maximum);

        // Using min() - minimum of two numbers
        double minimum = min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + minimum);

        // Using abs() - absolute value
        double negativeNumber = -25;
        double absolute = abs(negativeNumber);
        System.out.println("Absolute value of " + negativeNumber + " is: " + absolute);

        // Optional: Using random() - generates a random number between 0.0 and 1.0
        double randomValue = random();
        System.out.println("Random value: " + randomValue);
    }
}