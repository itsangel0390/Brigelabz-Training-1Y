import java.util.Scanner;

class fizzBuzz_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = sc.nextInt();
        String[] ar = new String[num];
        if (num <= 0) {
            System.out.println("Invalid num: ");
            return;
        }
        for (int i = 1; i <= ar.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ar[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                ar[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                ar[i - 1] = "Buzz";
            } else {
                ar[i - 1] = String.valueOf(i);
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Position : " + (i + 1) + " = "  + ar[i]);
        }
    }
}