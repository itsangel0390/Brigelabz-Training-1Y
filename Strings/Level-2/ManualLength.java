import java.util.Scanner;
public class ManualLength{
public static int findLength(String text){
int count=0;
try{
while(true){
text.charAt(count);
count++;
}
}
catch(StringIndexOutOfBoundsException e){
}
return count;
}
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter string: ");
String text=sc.next();
int manualLength= findLength(text);
int builtInLength= text.length();
System.out.println("Length using user-defined method: " + manualLength);
System.out.println("Length using built-in length(): " + builtInLength);
}
}