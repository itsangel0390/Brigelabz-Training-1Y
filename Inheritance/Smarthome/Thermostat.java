package Inheritance.Smarthome;
class Thermostat extends Device {
    int temperatureSetting;
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature: " + temperatureSetting);
    }
}