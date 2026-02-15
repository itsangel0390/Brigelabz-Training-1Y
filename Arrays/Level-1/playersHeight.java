import java.util.Scanner;
class playersHeight{
public static void main (String [] args){
Scanner sc= new Scanner(System.in);
double []height= new double[11];
double sum=0.0;
for(int i=0; i<height.length;i++){
System.out.println("enter player height: "+(i+1));
height[i]=sc.nextDouble();
}
for(int i=0; i<height.length;i++){
sum+=height[i];
}
double mean= sum/11;
System.out.println("Mean height of football players: "+mean);
}
}


