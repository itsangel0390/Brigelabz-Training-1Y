import java.util.Scanner;

class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a year: ");
    int year = sc.nextInt();
    if (year < 1528) {
      System.out.println("Year is less than 1528.");
    } else if (year % 400 == 0) {
      System.out.println("Leap Year");
    } else if (year % 100 == 0) {
      System.out.println("Not a Leap Year");
    } else if (year % 4 == 0) {
      System.out.println("Leap Year");
    } else {
      System.out.println("Not a Leap Year");
    }
  }
}
