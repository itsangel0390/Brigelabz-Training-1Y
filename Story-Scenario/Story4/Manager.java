public class Manager extends Employee {

    private String department;

    public Manager(int employeeId, String firstName, String lastName,
                   String company, String department) {
        super(employeeId, firstName, lastName, company);
        this.department = department;
    }

    @Override
    public String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase()
               + "@" + department.toLowerCase() + "."
               + company.toLowerCase() + ".com";
    }

    @Override
    public void displayInfo() {
        System.out.println("Role        : Manager");
        super.displayInfo();
        System.out.println("Department  : " + department);
    }

    public static void main(String[] args) {

        System.out.println("=== Employee Management System ===\n");

        Employee emp = new Employee(301, "Rahul", "Verma", "TechCorp");
        System.out.println("--- Employee ---");
        emp.displayInfo();

        System.out.println("\n--- Manager ---");
        Manager mgr = new Manager(302, "Sneha", "Gupta", "TechCorp", "HR");
        mgr.displayInfo();
    }
}
