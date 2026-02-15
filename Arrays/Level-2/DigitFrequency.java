import java.util.Scanner;
class DigitFrequency{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter a number: ");
int n= sc.nextInt();
int count =0;
int temp=n;
while(temp>0){  //count digits
count++;
temp=temp/10;
}
int []d= new int[count]; //store digits in array
temp=n;
for(int i=count-1;i>=0;i--){
d[i]=temp%10;
temp=temp/10;
}
int freq[]=new int[10];
for(int i=0; i<count;i++){
freq[d[i]]++;
}
System.out.println("Digit Frequency: ");
for(int i=0; i<10;i++){
if(freq[i]>0){
System.out.println(i+" occurs " + freq[i] +" times");
}
}
}
}
