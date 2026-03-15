import java.util.Scanner;

class VowelConsonantChecker {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a letter";
        }
    }

    public static String[][] analyzeString(String text) {
        int length = text.length();
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i); // get char at position i
            result[i][0] = String.valueOf(ch); // store char as String
            result[i][1] = checkCharType(ch); // store its type
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Character type: ");
        System.out.println("----------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = sc.nextLine();
        String[][] result = analyzeString(input);
        displayTable(result);
    }
}
