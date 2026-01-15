import java.util.Scanner;
class DistanceConversion{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter dis in feet: ");
double disFeet = sc.nextDouble();
double yards = disFeet/3; //1 yard=3feet
double miles = yards/1760;//1mile=1760 yards
System.out.println("the distance in yards is"+yards+"while distance in mile is"+miles.);
scanner.close();
}
}