public class Course {

    public static String platformName = "LearnSphere";

    protected int courseId;
    protected String courseName;
    protected double price;
    protected String instructor;

    public Course(int courseId, String courseName, double price, String instructor) {
        this.courseId = courseId;
        this.courseName = toTitleCase(courseName);
        this.price = price;
        this.instructor = instructor;
    }

    public static String toTitleCase(String input) {
        if (input == null || input.isEmpty()) return input;
        String[] words = input.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1))
              .append(" ");
        }
        return sb.toString().trim();
    }

    public double calculatePrice() {
        return price;
    }

    public void displayCourse() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor  : " + instructor);
        System.out.printf("Price       : Rs.%.2f%n", calculatePrice());
    }
}
