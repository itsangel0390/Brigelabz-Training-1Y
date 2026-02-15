import java.util.Scanner;
class numFactor{
public static void main (String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter num: ");
int num= sc.nextInt();
int maxFactor=10;
int fact[]= new int[maxFactor];
int index=0;
for(int i=1; i<=num;i++){
if(num%i==0){
if(index==maxFactor){
maxFactor=maxFactor*2;
int [] temp= new int[maxFactor];
for(int j=0; j<fact.length;j++){
temp[j]=fact[j];
}
fact=temp;
}
fact[index]=i;
index++;
}
}
System.out.println("Factors are: ");
for(int i=0; i<index;i++){
System.out.println(fact[i]+ " ");
}
}
}

