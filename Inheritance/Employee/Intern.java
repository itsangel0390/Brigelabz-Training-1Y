package Inheritance.Employee;
class Intern extends Employee {
    int duration;
    void displayDetails() {
        System.out.println("Intern Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Duration: " + duration + " months");
    }
}