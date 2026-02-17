import java.util.Scanner;

class ArrayIndexOutOfBoundss {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Tried accessing invalid array index.");
        } catch (RuntimeException e) {
            System.out.println("Some other runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter name: " + (i + 1));
            names[i] = sc.next();
        }
        System.out.println("Generating exception: ");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException().");
        }
        System.out.println("Handling exception: ");
        handleException(names);
    }
}