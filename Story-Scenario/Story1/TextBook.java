public class TextBook extends Book {

    private String subject;

    public TextBook(int bookId, String title, double price, String subject) {
        super(bookId, title, price);
        this.subject = subject;
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject : " + subject);
        System.out.println("Type    : TextBook");
    }
}
