import java.util.Scanner;
class gradeArr{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter number of students: ");
int s=sc.nextInt();
double [][] m=new double[s][3];
double[] p=new double[s];
String [] g=new String[s];
for(int i=0;i<s;i++){
System.out.println("enter marks of physics, chem, maths: "+(i+1));
m[i][0]=sc.nextDouble();
m[i][1]=sc.nextDouble();
m[i][2]=sc.nextDouble();
if(m[i][0]<0 || m[i][1]<0 || m[i][2]<0){
System.out.println("Invalid marks!");
i--;
continue; 
}
}
for(int i=0;i<s;i++){
double total= m[i][0]+m[i][1]+m[i][2];
p[i]=(total/300)*100;
if(p[i]>=80){
g[i]="A";
}
else if(p[i]<=79 && p[i]>=70){
g[i]="B";
}
else if(p[i]<=69 && p[i]>=60){
g[i]="C";
}
else if(p[i]<=59 && p[i]>=50){
g[i]="D";
}
else if(p[i]<=49 && p[i]>=40){
g[i]="E";
}
else{
g[i]="R";
}
}
System.out.println("Student Performance: ");
for(int i=0; i<s;i++){
System.out.println("Student: "+(i+1));
System.out.println("Physics: "+m[i][0]);
System.out.println("Chemistry: "+m[i][1]);
System.out.println("Maths: "+m[i][2]);
System.out.println("Percentage: "+String.format("%.2f",p[i]));
System.out.println("Grade: "+g[i]);
}
}
}

