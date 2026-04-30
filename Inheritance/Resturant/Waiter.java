package Inheritance.Resturant;
class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Waiter is serving food");
    }
}
