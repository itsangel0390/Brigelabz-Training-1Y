import java.util.Scanner;

class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num of operations: ");
        int num = sc.nextInt();
        System.out.println("Enter a num 1: ");
        double first = sc.nextDouble();
        System.out.println("Enter a num 2: ");
        double second = sc.nextDouble();
        System.out.println("Enter op: ");
        String op = sc.next();
        for (int i = 1; i < num; i++) {
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "%":
                    System.out.println("Result: " + (first % second));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}