import java.util.Scanner;

class ManualTrim {
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++; // remove leading space
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end--; // remove trailing space;
        }
        return new int[] { start, end };
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
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
        System.out.println("enter text with spaces: ");
        String input = sc.nextLine();
        int[] indexes = findTrimIndexes(input);
        int start = indexes[0];
        int end = indexes[1];
        String manualTrim = createSubstring(input, start, end);
        String builtInTrim = input.trim();
        boolean result = compareStrings(manualTrim, builtInTrim);
        System.out.println("Manual Trim: " + manualTrim);
        System.out.println("Built-in Trim: " + builtInTrim);
        System.out.println("Comparison result: " + result);
    }
}
