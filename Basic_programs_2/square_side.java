import java.util.Scanner;
class square_side{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter square peri: ");
double perimeter = sc.nextDouble();
double side = perimeter/4;
System.out.println("the length of the side is"+side+"whose perimeter is"+perimeter);
scanner.close();
}
}
