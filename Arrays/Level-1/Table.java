import java.util.Scanner;
class Table{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter num: ");
int num= sc.nextInt();
int []table = new int [10];
for(int i=6; i<=9;i++){
table[i-1]=num*i;
}
System.out.println("Table: ");
for(int i=6;i<=9;i++){
System.out.println(num+ "*"+ i+ "=" + table[i-1]);
}
}
}
