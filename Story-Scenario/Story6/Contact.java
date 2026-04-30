public class Contact {

    protected String name;
    protected String phoneNumber;
    protected String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Phone  : " + phoneNumber);
        System.out.println("Email  : " + email);
    }
}
