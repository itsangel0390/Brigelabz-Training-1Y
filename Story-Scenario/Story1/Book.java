public class Book {

    protected int bookId;
    protected String title;
    protected double price;
    public static String libraryName = "City Central Library";

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }

    public void displayInfo() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Price   : Rs." + price);
    }
}
