import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter physics marks: ");
        double p = sc.nextDouble();
        System.out.println("enter chemistry marks: ");
        double c = sc.nextDouble();
        System.out.println("enter maths marks: ");
        double m = sc.nextDouble();
        double total = p + c + m;
        double per = (total / 300) * 100;
        double avg = total / 3.0;
        String Grade = "";
        String remarks = "";
        if (per >= 80 && per <= 100) {
            Grade = "A";
            remarks = "Level 4, above agency-normalised standards.";
        } else if (per >= 70 && per <= 79) {
            Grade = "B";
            remarks = " Level 3, at agency-normalised standards.";
        } else if (per >= 60 && per <= 69) {
            Grade = "C";
            remarks = "Level 2, below, but approaching agency-normalised standards.";
        } else if (per >= 50 && per <= 59) {
            Grade = "D";
            remarks = " Level 1, well below agency-normalised standards.";
        } else if (per >= 40 && per <= 49) {
            Grade = "E";
            remarks = "Level 1-,too below agency-normalised standards.";
        } else if (per >= 39 && per < 39) {
            Grade = " F";
            remarks = " Remedial standards.";
        }
        System.out.println("Grade: " + Grade);
        System.out.println("remarks: " + remarks);
        System.out.printf("Average marks: %.2f\n", avg);
        System.out.printf("Percentage: %.2f\n", per);
    }
}