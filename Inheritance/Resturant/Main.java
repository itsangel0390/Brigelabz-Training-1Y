package Inheritance.Resturant;
public class Main {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.name = "Amit";
        c.id = 1;
        Waiter w = new Waiter();
        w.name = "Rohit";
        w.id = 2;
        c.performDuties();
        w.performDuties();
    }
}
