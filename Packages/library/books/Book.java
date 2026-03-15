// File: library/books/Book.java
package library.books;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false; // book is available initially
    }

    // Method to issue book
    public boolean issueBook() {
        if (!isIssued) {
            isIssued = true;
            return true;
        } else {
            return false;
        }
    }

    // Method to return book
    public void returnBook() {
        isIssued = false;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Book: " + title + ", Author: " + author + ", Available: " + !isIssued);
    }

    // Getter for title
    public String getTitle() {
        return title;
    }
}
