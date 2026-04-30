package Inheritance.Resturant;
class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Chef is cooking food");
    }
}
