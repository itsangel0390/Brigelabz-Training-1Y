package Inheritance.Order;
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    String getOrderStatus() {
        return "Order Delivered";
    }
}