import java.util.Scanner;
class GradeArr_oneD{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter number of students: ");
int s=sc.nextInt();
double [] p=new double[s];
double [] c=new double[s];
double [] m=new double[s];
double [] per=new double[s];
String [] g= new String[s];
for(int i=0;i<s;i++){
System.out.println("enter marks of physics, chem, maths: "+(i+1));
p[i]=sc.nextDouble();
c[i]=sc.nextDouble();
m[i]=sc.nextDouble();
if(p[i]<0 || c[i]<0 || m[i]<0){
System.out.println("Invalid marks!");
i--;
continue; 
}
}
for(int i=0;i<s;i++){
double total= p[i]+c[i]+m[i];
per[i]=(total/300)*100;
if(per[i]>=80){
g[i]="A";
}
else if(per[i]<=79 && per[i]>=70){
g[i]="B";
}
else if(per[i]<=69 && per[i]>=60){
g[i]="C";
}
else if(per[i]<=59 && per[i]>=50){
g[i]="D";
}
else if(per[i]<=49 && per[i]>=40){
g[i]="E";
}
else{
g[i]="R";
}
}
System.out.println("Student Performance: ");
for(int i=0; i<s;i++){
System.out.println("Student: "+(i+1));
System.out.println("Physics: "+p[i]);
System.out.println("Chemistry: "+c[i]);
System.out.println("Maths: "+m[i]);
System.out.println("Percentage: "+String.format("%.2f",per[i]));
System.out.println("Grade: "+g[i]);
}
}
}


