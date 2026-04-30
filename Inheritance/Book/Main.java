package Inheritance.Book;
public class Main {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics";
        a.publicationYear = 2022;
        a.name = "Rahul";
        a.bio = "Java Developer";
        a.displayInfo();
    }
}
