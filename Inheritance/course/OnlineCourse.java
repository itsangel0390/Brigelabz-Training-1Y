package Inheritance.course;
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
