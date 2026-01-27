import java.util.Scanner;
class forCounter{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter count: ");
int c=sc.nextInt();
for(int i=c;i>=1;i--){
System.out.println(i);
}
}
}