public class BusinessContact extends Contact {

    private String companyName;
    private String designation;

    public BusinessContact(String name, String phoneNumber, String email,
                           String companyName, String designation) {
        super(name, phoneNumber, email);
        this.companyName = companyName;
        this.designation = designation;
    }

    @Override
    public void display() {
        System.out.println("Type        : Business Contact");
        System.out.println("Name        : " + name.toUpperCase());
        System.out.println("Phone       : " + phoneNumber);
        System.out.println("Email       : " + email);
        System.out.println("Company     : " + companyName.toUpperCase());
        System.out.println("Designation : " + designation);
    }

    public static void main(String[] args) {

        System.out.println("=== Contact App ===\n");

        Contact[] contacts = {
            new Contact("Aman Singh", "9876543210", "aman@gmail.com"),
            new BusinessContact("Pooja Mehta", "9123456780", "pooja@biz.com",
                                "Infosys Ltd", "Software Engineer")
        };

        for (Contact c : contacts) {
            System.out.println("-----------------------------");
            c.display();
        }
        System.out.println("-----------------------------");
    }
}
