import java.util.Scanner;
class voteAge{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int []age= new int[10];
for(int i=0;i<10;i++){
	System.out.println("Age of student"+(i+1)+ ": ");
	age[i]=sc.nextInt();
}
for(int i=0;i<age.length;i++){
	int currentAge= age[i];
if(currentAge<0){
System.out.println("Invalid Age!");
}
else if(currentAge>=18){
System.out.println("The student "+(i+1)+ " with age "+currentAge + " can vote.");
}
else{
System.out.println("The student "+(i+1)+ " with age "+currentAge + " can not vote.");
}
}
}
}