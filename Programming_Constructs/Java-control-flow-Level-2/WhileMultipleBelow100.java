import java.util.Scanner;

class WhileMultipleBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = sc.nextInt();
        if (num < 100 && num > 0) {
            int i = 100;
            while (i >= 1) {
                if (i % num == 0) {
                    System.out.println("Multiples are: "+i);
                }
                i--;
            }
        } else {
            System.out.println("Invalid num");
        }
    }
}
