import java.util.Scanner;
class storeAndSum{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
double [] ele= new double[10];
int index=0;
double total=0.0;
while(true){
System.out.println("enter num: "+(index+1));
double num= sc.nextDouble();
if(num<=0){
break;
}
if(index==10){
break;
}
ele[index]=num;
index++;
}
for(int i=0; i<=index;i++){
total+=ele[i];
}
for(int i=0;i<=index;i++){
System.out.println(ele[i]);
}
System.out.println("Total = "+ total);
}
}
