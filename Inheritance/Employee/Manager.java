package Inheritance.Employee;
class Manager extends Employee {
    int teamSize;
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
    }
}