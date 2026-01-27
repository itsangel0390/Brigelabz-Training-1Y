import java.util.Scanner;
public class forSumNatNumComp {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
if (n > 0) {
    int sumByLoop = 0;
   for (int i=1; i <= n;i++) {
    sumByLoop = sumByLoop + i;
   }
   int sumByFormula = n * (n + 1) / 2;
 System.out.println("Sum using while loop: " + sumByLoop);
 System.out.println("Sum using formula: " + sumByFormula);
 if (sumByLoop == sumByFormula) {
  System.out.println("Both computations are correct.");
 } else {
  System.out.println("The computations are not matching."
}
} else {
  System.out.println("The number " + n + " is not a natural number.");
    }
  }
}
