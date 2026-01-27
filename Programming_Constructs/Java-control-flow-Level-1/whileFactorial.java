import java.util.Scanner;
class whileFactorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter num: ");
int num=sc.nextInt();
if(num>0){
long fact=1;
int i=1;
while(i<=n){
fact*=i;
i++;
}
System.out.println("The factorial is "+fact);
}
else{
System.out.println("Not a positive number.");
}
}
}