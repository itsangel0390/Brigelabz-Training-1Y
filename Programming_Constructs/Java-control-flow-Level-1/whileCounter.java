import java.util.Scanner;
class whileCounter{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter count: ");
int count=sc.nextInt();
while(count>=1){
System.out.println(count);
count--;
}
}
}