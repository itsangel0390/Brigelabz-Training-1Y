package Inheritance.course;
public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse();
        p.courseName = "Java Programming";
        p.duration = 3;
        p.platform = "Udemy";
        p.isRecorded = true;
        p.fee = 5000;
        p.discount = 500;
        p.displayInfo();
    }
}
