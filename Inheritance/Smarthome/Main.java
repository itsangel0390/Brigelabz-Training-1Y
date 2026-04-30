package Inheritance.Smarthome;
public class Main {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = 101;
        t.status = "ON";
        t.temperatureSetting = 24;
        t.displayStatus();
    }
}
