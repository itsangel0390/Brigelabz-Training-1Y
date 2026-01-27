import java.util.Scanner;
class ArmstrongNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number: ");
int num= sc.nextInt();
int sum=0;
int originalNum=num;
while(originalNum!=0){
int digit=originalNum%10; //get last digit using modulus operator.
sum+=(digit*digit*digit);
originalNum=originalNum/10;  //remove last digit using division.
}
if(sum==num){
System.out.println("Armstrong Number");
}
else{
System.out.println("Not a Armstrong Number");
}
sc.close():
}
}
