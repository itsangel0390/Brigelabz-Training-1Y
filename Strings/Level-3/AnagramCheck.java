import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Frequency array for ASCII characters
        int[] freq = new int[256];

        // Step 3: Count frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            freq[text1.charAt(i)]++;
        }

        // Step 4: Decrease frequency using second text
        for (int i = 0; i < text2.length(); i++) {
            freq[text2.charAt(i)]--;
        }

        // Step 5: Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The texts are Anagrams.");
        } else {
            System.out.println("The texts are NOT Anagrams.");
        }
    }
}