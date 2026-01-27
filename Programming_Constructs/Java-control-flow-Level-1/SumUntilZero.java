import java.util.Scanner;
class SumUntilZero{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double total =0.0;
System.out.println("enter num: ");
double num=sc.nextDouble();
while(num!=0){
total+=num;
System.out.println("enter num: ");
num=sc.nextDouble();
}System.out.println("The total sum is "+total);
}
}
