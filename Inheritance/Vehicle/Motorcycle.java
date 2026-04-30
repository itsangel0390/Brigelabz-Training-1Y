package Inheritance.Vehicle;
class Motorcycle extends Vehicle {
    boolean hasGear;
    void displayInfo() {
        System.out.println("Motorcycle Speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Has Gear: " + hasGear);
    }
}