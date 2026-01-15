import java.util.Scanner;
class IntOperation{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
scanner.close();
int result1=a+b*c;//mul has high precedence
int result2=a*b+c;
int result3 = c+a/b;//div has high precedence
int result4=a%b+c;//% high precedence
System.out.println("The results of IntOperations are"+result1+","+result2+","+result3+"and"+result4.);
}
}