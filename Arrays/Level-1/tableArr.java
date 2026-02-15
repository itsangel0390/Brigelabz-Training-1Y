import java.util.Scanner;
class tableArr{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter num: ");
int num= sc.nextInt();
int []table = new int [10];
for(int i=1; i<=10;i++){
table[i-1]=num*i;
}
System.out.println("Table: ");
for(int i=1;i<=10;i++){
System.out.println(num+ "*"+ i+ "=" + table[i-1]);
}
}
}
