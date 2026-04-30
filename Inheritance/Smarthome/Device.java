package Inheritance.Smarthome;
class Device {
    int deviceId;
    String status;
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}