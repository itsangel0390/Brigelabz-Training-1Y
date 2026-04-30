public class Employee {

    protected int employeeId;
    protected String firstName;
    protected String lastName;
    protected String company;

    public Employee(int employeeId, String firstName, String lastName, String company) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase()
               + "@" + company.toLowerCase() + ".com";
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + firstName + " " + lastName);
        System.out.println("Email       : " + generateEmail());
    }
}
