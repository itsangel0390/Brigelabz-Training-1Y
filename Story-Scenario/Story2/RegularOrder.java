public class RegularOrder extends Order {

    public RegularOrder(int orderId, String itemName, double basePrice) {
        super(orderId, itemName, basePrice);
    }

    @Override
    public double calculateTotal() {
        return basePrice + deliveryCharge;
    }

    @Override
    public void displayOrder() {
        System.out.println("Order Type : Regular Order");
        super.displayOrder();
    }
}
