package Inheritance.Vehicle;
class Truck extends Vehicle {
    int loadCapacity;
    void displayInfo() {
        System.out.println("Truck Speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity);
    }
}
