import java.util.Scanner;
class DoubleOpt{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
double a = sc.nextDouble();
double b= sc.nextDouble();
double c= sc.nextDouble();
scanner.close();
double result1=a+b*c;//mul has high precedence
double result2=a*b+c;
double result3 = c+a/b;//div has high precedence
double result4=a%b+c;//% high precedence
System.out.println("The results of DoubleOpt are"+result1+","+result2+","+result3+"and"+result4.);
}
}