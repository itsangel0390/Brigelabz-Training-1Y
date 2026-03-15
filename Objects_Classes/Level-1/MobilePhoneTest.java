import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();

        System.out.print("Enter Phone Brand: ");
        phone.brand = sc.nextLine();

        System.out.print("Enter Phone Model: ");
        phone.model = sc.nextLine();

        System.out.print("Enter Phone Price: ");
        phone.price = sc.nextDouble();

        System.out.println("\nMobile Phone Details:");
        phone.displayDetails();
    }
}
