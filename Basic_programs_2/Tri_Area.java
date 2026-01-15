import java.util.Scanner
class Tri_area{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
double base = sc.nextDouble();
double height= sc.nextDouble();
double areaSqCm= 0.5*base*height;
double areaSqInch= areaSqCm/6.4516;
System.out.println("The Area of the triangle in sq in is" + areaSqInch+" and sq cm is "+ areaSqCm);
scanner.close();
}
}