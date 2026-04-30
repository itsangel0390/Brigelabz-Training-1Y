public class Student {

    protected int studentId;
    protected String name;
    protected double marks;

    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 45) return "C";
        else return "F";
    }

    public void displayResult() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.printf("Marks      : %.2f / 100%n", marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}
