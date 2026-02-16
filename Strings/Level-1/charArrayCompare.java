import java.util.Scanner;

class charArrayCompare {
    public static char[] getchars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        String text = sc.next();
        char[] manual = getchars(text);
        char[] builtin = text.toCharArray();
        boolean result = compare(manual, builtin);
        System.out.println("using manual method: ");
        for (int i = 0; i < manual.length; i++) {
            System.out.print(manual[i] + " ");
        }
        System.out.println();
        System.out.println("using builtIn method: ");
        for (int i = 0; i < builtin.length; i++) {
            System.out.print(builtin[i] + " ");
        }
        System.out.println();
        System.out.println("Both char equal: " + result);
    }
}
