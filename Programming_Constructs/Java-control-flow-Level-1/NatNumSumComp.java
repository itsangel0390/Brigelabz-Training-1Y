import java.util.Scanner;
class NatNumSumComp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter num: ");
int n=sc.nextInt();
if(n>0){
  int sumByLoop=0;
  int i=1;
  while(i<=n){
  sumByLoop+=i;
  i++;
  }
int sumByFormula=n*(n+1)/2;
System.out.println("Sum using while loop: "+sumByLoop);
System.out.println("Sum using formula: "+sumByFormula);
    if (sumByLoop == sumByFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are not matching.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
