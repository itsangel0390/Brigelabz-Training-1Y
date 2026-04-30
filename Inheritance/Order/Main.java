package Inheritance.Order;
public class Main {
    public static void main(String[] args) {
        Order o = new Order();
        o.orderId = 1;
        o.orderDate = "20/03/2026";
        ShippedOrder s = new ShippedOrder();
        s.orderId = 2;
        s.orderDate = "19/03/2026";
        s.trackingNumber = "TR123";
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 3;
        d.orderDate = "18/03/2026";
        d.trackingNumber = "TR456";
        d.deliveryDate = "21/03/2026";
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
