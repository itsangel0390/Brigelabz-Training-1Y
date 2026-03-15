import java.util.Scanner;

class ShortestLongestWord {
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
        String words[] = new String[wordCount];
        String currentWord = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                words[index] = currentWord;
                index++;
                currentWord = "";
            }
        }
        words[index] = currentWord;
        return words;
    }

    public static String[][] create2DArr(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] data) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 0; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            int shortesLength = Integer.parseInt(data[shortestIndex][1]);
            int longestLegth = Integer.parseInt(data[longestIndex][1]);
            if (currentLength < shortesLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLegth) {
                longestIndex = i;
            }
        }
        return new int[] { shortestIndex, longestIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text: ");
        String s = sc.nextLine();
        String words[] = splitText(s);
        String[][] data = create2DArr(words);
        int[] result = findShortestLongest(data);
        System.out.println("Words and Lengths: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " - " + data[i][1]);
        }
        System.out.println("Shortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word: " + data[result[1]][0]);
    }
}
