public class TestLibrary {

    public static void main(String[] args) {

        System.out.println("=== " + Book.libraryName + " ===\n");

        Book[] books = {
            new Book(101, "Introduction to Java", 450.00),
            new TextBook(102, "Physics Vol-1", 380.00, "Physics"),
            new Magazine(103, "Science Today", 120.00, "March 2024")
        };

        int daysLate = 5;

        for (Book b : books) {
            System.out.println("-----------------------------");
            b.displayInfo();
            System.out.printf("Fine for %d day(s) late : Rs.%.2f%n", daysLate, b.calculateFine(daysLate));
        }

        System.out.println("-----------------------------");
    }
}
