public class TestCourse {

    public static void main(String[] args) {

        System.out.println("=== " + Course.platformName + " Online Learning Platform ===\n");

        Course[] courses = {
            new Course(601, "introduction to python", 2999.00, "Dr. Arjun Menon"),
            new RecordedCourse(602, "data structures and algorithms", 4999.00,
                               "Prof. Neha Shah", 85),
            new LiveCourse(603, "machine learning with python", 7999.00,
                           "Dr. Vikram Iyer", "Tue/Thu 8:00 PM")
        };

        for (Course c : courses) {
            System.out.println("-----------------------------");
            c.displayCourse();
        }

        System.out.println("-----------------------------");
    }
}
