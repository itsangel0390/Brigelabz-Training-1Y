import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even num: " + i);
                } else {
                    System.out.println("Odd num: " + i);
                }
            }
        } else {
            System.out.println("The number is not natural number.");
        }
    }
}
