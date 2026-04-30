public class Magazine extends Book {

    private String issueMonth;

    public Magazine(int bookId, String title, double price, String issueMonth) {
        super(bookId, title, price);
        this.issueMonth = issueMonth;
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 5.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue   : " + issueMonth);
        System.out.println("Type    : Magazine");
    }
}
