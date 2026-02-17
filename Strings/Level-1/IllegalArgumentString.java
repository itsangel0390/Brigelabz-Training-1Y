import java.util.Scanner;

class IllegalArgumentString {
    public static void generateException(String text) {
        System.out.println(text.substring(4, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Some other runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String text = sc.next();
        System.out.println("Generating exception: ");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException().");
        }
        System.out.println("Handling exception: ");
        handleException(text);
    }
}
