import java.util.Scanner;
class BMI{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter number of persons: ");
int person=sc.nextInt();
double [] w= new double[person];
double [] h=new double[person];
double [] bmi=new double[person];
String [] status= new String[person];
for(int i=0; i<person;i++){
System.out.println("enter details: "+(i+1));
System.out.println("weight(kg) and height(cm): ");
w[i]=sc.nextDouble();
h[i]=sc.nextDouble();
}
for(int i=0; i<person;i++){
double hM=h[i]/100;
bmi[i]=w[i]/(hM*hM);
if(bmi[i]<=18.4){
status[i]="Underweight";
}
else if(bmi[i]>=18.5 && bmi[i]<=24.9){
status[i]="Normal";
}
else if(bmi[i]>=25.0 && bmi[i]<=39.9){
status[i]="Overweight";
}
else{
status[i]="Obese";
}
}
System.out.println("BMI details:");
for(int i=0; i<person;i++){
System.out.println("Person : "+(i+1));
System.out.println("Weight : "+w[i]);
System.out.println("Height : "+h[i]);
System.out.println("BMI : "+String.format("%.2f",bmi[i]));
System.out.println("Status : "+status[i]);
}
}
}