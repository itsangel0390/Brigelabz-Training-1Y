import java.util.Scanner;
class student_fee{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
double fee = sc.nextInt();
double discountPer= sc.nextInt();
double discount = fee*(discountPer/100);
double payFee = fee-discount;
System.out.println("payFee: "+payFee);
System.out.println("discount: "+discount);
}
}