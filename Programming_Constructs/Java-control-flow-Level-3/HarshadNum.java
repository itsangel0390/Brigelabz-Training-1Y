import java.util.Scanner;
class HarshadNum{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("enter a num: ");
int num=sc.nextInt();
int sum=0;
int originalnum=num;
while(num!=0){
int digit = num%10; //get last digit of num
sum+=digit;
num=num/10; //remove last digit
}
if(originalnum%sum==0){
System.out.println("It is a Harshad number.");
}
else{
System.out.println("Not a Harshad number.");
}
}
}