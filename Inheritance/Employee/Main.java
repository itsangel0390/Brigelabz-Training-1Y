package Inheritance.Employee;
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Amit";
        m.id = 1;
        m.salary = 80000;
        m.teamSize = 5;
        Developer d = new Developer();
        d.name = "Riya";
        d.id = 2;
        d.salary = 60000;
        d.programmingLanguage = "Java";
        Intern i = new Intern();
        i.name = "Rahul";
        i.id = 3;
        i.salary = 20000;
        i.duration = 6;
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
