package Inheritance.Vehicle;
class Car extends Vehicle {
    int seatCapacity;
    void displayInfo() {
        System.out.println("Car Speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Seats: " + seatCapacity);
    }
}