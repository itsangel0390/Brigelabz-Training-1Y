import java.util.Scanner;
class maxNumTwo{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
System.out.println("enter number: ");
int maxDigit=10;
int num= sc.nextInt();
int []digits=new int[maxDigit];
int Index=0;
int largest=0;
int []temp= new int[maxDigit];
int secondLargest=0;
while(num!=0){
if(Index==maxDigit){
maxDigit=maxDigit+10;
for(int i=0;i<digits.length;i++){
temp[i]=digits[i];
}
digits=temp;
}
digits[Index]=num%10; //last digit
num=num/10; // remove last digit
Index++;
}
for(int i=0; i<Index;i++){
if(digits[i]>largest){
secondLargest=largest;
largest=digits[i];
}
else if(digits[i]>secondLargest && digits[i]!=largest){
secondLargest=digits[i];
}
}
System.out.println("Largest num: "+largest);
System.out.println("Second Largest num: "+secondLargest);
}
}
