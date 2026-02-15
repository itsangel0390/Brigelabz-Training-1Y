import java.util.Scanner;
class twoD_Arr{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter rows: ");
int rows= sc.nextInt();
System.out.println("enter cols: ");
int cols=sc.nextInt();
int [][]matrix= new int[rows][cols];
int [] arr= new int[rows*cols];
int index=0; 
System.out.println("enter matrix elements: ");
for(int i=0; i<rows;i++){
for(int j=0; j<cols;j++){
matrix[i][j]=sc.nextInt();
}
}
for(int i=0; i<rows;i++){
for(int j=0; j<cols;j++){
arr[index]=matrix[i][j];
index++;
}
}
System.out.println("array: ");
for(int i=0; i<arr.length;i++){
System.out.println(arr[i]+ " ");
}
}
}