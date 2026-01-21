import java.util.Scanner;

class numDiv_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("divisble");
        } else {
            System.out.println("not divisble");
        }
    }
}