package Inheritance.Order;
class ShippedOrder extends Order {
    String trackingNumber;
    String getOrderStatus() {
        return "Order Shipped";
    }
}