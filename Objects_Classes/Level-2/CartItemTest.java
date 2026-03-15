import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Method to add item
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
        System.out.println("Item added to cart.");
    }

    // Method to remove item
    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

public class CartItemTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        cart.addItem(name, price, quantity);

        System.out.println("\nCart Details:");
        cart.displayTotalCost();

        System.out.print("\nDo you want to remove the item? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            cart.removeItem();
        }
    }
}
