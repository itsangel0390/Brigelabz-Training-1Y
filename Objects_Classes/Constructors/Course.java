
public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks or months
    private double fee;

    // Class variable (common for all courses)
    private static String instituteName = "Default Institute";

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create course objects
        Course course1 = new Course("Java Programming", 12, 500);
        Course course2 = new Course("Python Programming", 10, 450);

        // Display course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update institute name
        Course.updateInstituteName("Tech Academy");
        System.out.println();

        // Display course details again after update
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
