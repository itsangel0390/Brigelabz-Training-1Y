public class LiveCourse extends Course {

    private static final double DISCOUNT_RATE = 0.05;
    private String schedule;

    public LiveCourse(int courseId, String courseName, double price,
                       String instructor, String schedule) {
        super(courseId, courseName, price, instructor);
        this.schedule = schedule;
    }

    @Override
    public double calculatePrice() {
        return price - (price * DISCOUNT_RATE);
    }

    @Override
    public void displayCourse() {
        System.out.println("Type        : Live Course (5% Discount)");
        super.displayCourse();
        System.out.println("Schedule    : " + schedule);
    }
}
