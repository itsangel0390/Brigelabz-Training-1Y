import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost
    void calculateTotal(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }
}

class ItemTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Item Price: ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.println("\nItem Details:");
        item.displayDetails();
        item.calculateTotal(quantity);
    }
}