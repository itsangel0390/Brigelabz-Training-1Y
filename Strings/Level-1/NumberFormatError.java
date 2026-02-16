import java.util.Scanner;

class NumberFormat {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    public static void hanldeException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Input is not a invalid integer.");
        } catch (RuntimeException e) {
            System.out.println("Some other runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        String text = sc.next();
        System.out.println("Generating Exception: ");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException().");
        }
        System.out.println("Handling exception: ");
        hanldeException(text);
        sc.close();
    }
}
