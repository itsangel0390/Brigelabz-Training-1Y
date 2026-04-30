package Inheritance.course;
class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;
    void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount);
    }
}
