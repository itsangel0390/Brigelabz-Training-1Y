import java.util.Scanner;

class CompareStrings {
    public static boolean compareUsingCharAt(String str1, String str2) {
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
        System.out.println("enter first string: ");
        String str1 = sc.next();
        System.out.println("enter second string: ");
        String str2 = sc.next();
        boolean resultCharAt = compareUsingCharAt(str1, str2);
        boolean resultEquals = str1.equals(str2);
        System.out.println("Result using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give same results.");
        } else {
            System.out.println("Not same results.");
        }
    }
}
