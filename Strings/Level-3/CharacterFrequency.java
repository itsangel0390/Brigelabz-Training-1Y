import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters
    public static int[][] findFrequency(String text) {

        int[] freq = new int[256];

        // Count frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = 0;
            }
        }

        // Reset frequency again
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // 2D array to store result
        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = ch;
                result[index][1] = freq[ch];
                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[][] result = findFrequency(text);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((char)result[i][0] + " : " + result[i][1]);
        }
    }
}
