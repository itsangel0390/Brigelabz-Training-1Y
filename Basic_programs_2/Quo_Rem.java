import java.util.Scanner;
class Quo_Rem{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter num1: ");
int num1= sc.nextInt();
System.out.println("enter num2: ");
int num2 = sc.nextInt();
double quo = num1/num2;
double rem = num1%num2;
System.out.println("The Quotient is"+quo+"and Reminder is"+rem+"of two number"+num1+"and"+num2.)
;
scanner.close();
}
}
