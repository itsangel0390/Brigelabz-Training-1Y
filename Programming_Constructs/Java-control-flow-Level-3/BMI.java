import java.util.Scanner;
class BMI{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a weight(in kg): ");
double w= sc.nextDouble();
System.out.println("enter a height(in cm): ");
double h= sc.nextDouble();
double hM=h/100; //cm to m
double bmi=w/(hM*hM);
if (bmi <= 18.4) {
            System.out.println("BMI = " + bmi);
            System.out.println("Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI = " + bmi);
            System.out.println("Normal weight");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("BMI = " + bmi);
            System.out.println("Overweight");
        } 
        else {
            System.out.println("BMI = " + bmi);
            System.out.println("Obese");
        }
    }
}
