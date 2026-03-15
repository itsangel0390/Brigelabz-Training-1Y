import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "Fail";
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Student Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        s.marks = sc.nextInt();

        System.out.println("\nStudent Details:");
        s.displayDetails();
    }
}