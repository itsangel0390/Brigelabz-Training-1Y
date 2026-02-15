import java.util.Scanner;
class ZaraBonus{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
int n=10;
double []salary= new double[n];
double []serYears= new double[n];
double []newSal= new double[n];
double [] bonus= new double[n];
int totalBonus=0;
int totalOldSal=0;
int totalNewSal=0;
for(int i=0; i<n;i++){
System.out.println("enter details: "+(i+1));
salary[i]=sc.nextDouble();
serYears[i]=sc.nextDouble();
if(salary[i]<=0 && serYears[i]<=0){
System.out.println("Invalid! enter again");
i--;
}
}
for(int i=0; i<n;i++){
if(serYears[i]>5){
bonus[i]=salary[i]*0.05;
}
else{
bonus[i]=salary[i]*0.02;
}
newSal[i]=salary[i]+bonus[i];
totalBonus+=bonus[i];
totalOldSal+=salary[i];
totalNewSal+=newSal[i];
}
System.out.println("Zara Company Bonus");
System.out.println("Total Old salary: "+totalOldSal);
System.out.println("Total Bonus: "+totalBonus);
System.out.println("Total New Salary: "+totalNewSal);
}
}