import java.util.Scanner;
class SumUntilZeroOrNeg{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double total =0.0;
while(true){
System.out.println("enter num: ");
double num=sc.nextDouble();
  if(num<=0){
  break;
  }
 total+=num;
}
System.out.println("The total value is: "+total);
}
} 