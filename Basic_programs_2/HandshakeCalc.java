import java.util.Scanner;
class HandshakeCalc{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int numOfStudents= sc.nextInt();
scanner.close();
long maxHandshakes=(long)numOfStudents*(numOfStudents-1)/2;
System.out.println("the maxHandshakes: "+maxHandshakes);
}}