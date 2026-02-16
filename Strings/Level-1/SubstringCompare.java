import java.util.Scanner;

public class SubstringCompare {
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static boolean compareString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String text = sc.next();
        System.out.println("enter a start index: ");
        int start = sc.nextInt();
        System.out.println("enter end index: ");
        int end = sc.nextInt();
        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid indexes entered.");
            return;
        }
        String manualSubstring = createSubstringUsingCharAt(text, start, end);
        String builtinSubstring = text.substring(start, end);
        boolean comparisonResult = compareString(manualSubstring, builtinSubstring);
        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using built-in substring(): " + builtinSubstring);
        System.out.println("Both substrings equal: " + comparisonResult);
    }
}