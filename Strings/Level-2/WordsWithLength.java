import java.util.Scanner;

class WordsWithLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitText(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;
        String[] words = new String[wordCount];
        String currentword = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentword = currentword + ch;
            } else {
                words[index] = currentword;
                index++;
                currentword = "";
            }
        }
        words[index] = currentword;
        return words;

    }

    public static String[][] create2DArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();
        String[] words = splitText(input);
        String[][] finalResult = create2DArray(words);
        System.out.println("Word Length: ");
        for (int i = 0; i < finalResult.length; i++) {
            int len = Integer.parseInt(finalResult[i][1]);
            System.out.println(finalResult[i][0] + " "+ len);
        }
    }
}