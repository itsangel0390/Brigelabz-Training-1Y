public class EngineeringStudent extends Student {

    private String branch;
    private int semester;

    public EngineeringStudent(int studentId, String name, double marks,
                               String branch, int semester) {
        super(studentId, name + " (" + branch + ")", marks);
        this.branch = branch;
        this.semester = semester;
    }

    @Override
    public String calculateGrade() {
        String grade = super.calculateGrade();
        double cgpa = marks / 10.0;
        return grade + " | CGPA: " + String.format("%.1f", cgpa);
    }

    @Override
    public void displayResult() {
        System.out.println("Type       : Engineering Student");
        System.out.println("Branch     : " + branch);
        System.out.println("Semester   : " + semester);
        super.displayResult();
    }

    public static void main(String[] args) {

        System.out.println("=== Student Result System ===\n");

        Student[] students = {
            new Student(501, "Riya Kapoor", 82.0),
            new EngineeringStudent(502, "Karan Joshi", 91.5, "Computer Science", 4),
            new EngineeringStudent(503, "Deepa Nair", 58.0, "Mechanical", 2)
        };

        for (Student s : students) {
            System.out.println("-----------------------------");
            s.displayResult();
        }
        System.out.println("-----------------------------");
    }
}
