import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Method to book ticket
    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
}

public class MovieTicketTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(movie, seat, price);

        System.out.println("\nTicket Details:");
        ticket.displayDetails();
    }
}
