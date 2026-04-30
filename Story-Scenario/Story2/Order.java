public class Order {

    public static double deliveryCharge = 40.0;

    protected int orderId;
    protected String itemName;
    protected double basePrice;

    public Order(int orderId, String itemName, double basePrice) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    public double calculateTotal() {
        return basePrice + deliveryCharge;
    }

    public void displayOrder() {
        System.out.println("Order ID   : " + orderId);
        System.out.println("Item       : " + itemName);
        System.out.println("Base Price : Rs." + basePrice);
        System.out.printf("Total      : Rs.%.2f%n", calculateTotal());
    }
}
