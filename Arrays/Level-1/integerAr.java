import java.util.Scanner;
class integerAr{
public static void main(String []args){
int []num= new int[5];
Scanner sc= new Scanner(System.in);
for(int i=0;i<num.length;i++){
System.out.println("enter num"+(i+1)+ ": ");
num[i]=sc.nextInt();
}
for(int i=0;i<num.length;i++){
if(num[i]>0){
if(num[i]%2==0){
System.out.println(num[i]+ " is even number.");
}
else{
System.out.println(num[i]+ " is odd number.");
}
}
else if(num[i]<0){
System.out.println(num[i]+ " is negative number.");
}
else{
System.out.println(num[i]+ " is zero.");
}
}
System.out.println("num comparison");
if(num[0]==num[num.length-1]){
System.out.println("Equal");
}
else if(num[0]>num[num.length-1]){
System.out.println("first num is greater.");
}
else{
System.out.println("last num is greater.");
}
}
}