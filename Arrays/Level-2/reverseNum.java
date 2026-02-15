import java.util.Scanner;

class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while (num != 0 ) {
            int d = num%10;
            rev = rev * 10 + d;
            num/=10;
        }
        if (rev == temp) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
