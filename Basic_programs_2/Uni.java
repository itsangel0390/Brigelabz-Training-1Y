class Uni {
public static void main(String args[]){
int fee = 125000;
double discountPercent=10;
double discount = fee*(discountPercent/100);
double payFee = fee-discount; 
System.out.println("discount: "+discount);
System.out.println("payFee: "+payFee);
}
}