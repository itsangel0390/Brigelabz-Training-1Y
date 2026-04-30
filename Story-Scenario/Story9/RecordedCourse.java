public class RecordedCourse extends Course {

    private static final double DISCOUNT_RATE = 0.10;
    private int totalVideos;

    public RecordedCourse(int courseId, String courseName, double price,
                           String instructor, int totalVideos) {
        super(courseId, courseName, price, instructor);
        this.totalVideos = totalVideos;
    }

    @Override
    public double calculatePrice() {
        return price - (price * DISCOUNT_RATE);
    }

    @Override
    public void displayCourse() {
        System.out.println("Type        : Recorded Course (10% Discount)");
        super.displayCourse();
        System.out.println("Total Videos: " + totalVideos);
    }
}
