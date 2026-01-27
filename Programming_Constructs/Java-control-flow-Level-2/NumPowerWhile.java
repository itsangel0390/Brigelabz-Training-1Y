import java.util.Scanner;
class NumPowerWhile{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter number: ");
int num=sc.nextInt();
System.out.println("Enter power: ");
int power=sc.nextInt();
int result=1;
int i=1; 
while(i<=power){
result*=num;
i++;
System.out.println("Result: "+result);
}
}
}
