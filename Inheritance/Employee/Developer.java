package Inheritance.Employee;
class Developer extends Employee {
    String programmingLanguage;
    void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Language: " + programmingLanguage);
    }
}
