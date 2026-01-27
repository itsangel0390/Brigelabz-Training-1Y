import java.util.Scanner;
class NumPower{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("enter num: ");
int num=sc.nextInt();
System.out.println("enter power: ");
int power=sc.nextInt();
int result=1;
for(int i=1; i<=power;i++){
result*=num;
System.out.println("Result: "+result);
}
}
}
