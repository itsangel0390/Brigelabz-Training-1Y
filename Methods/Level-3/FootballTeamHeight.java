import java.util.Random;

public class FootballTeamHeight {

    // Method to calculate sum of elements in an array
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    // Method to find shortest height
    public static int shortestHeight(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int tallestHeight(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150cm and 250cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 + [0..100] => 150..250
        }

        // Display heights
        System.out.print("Heights of players (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Display shortest, tallest, and mean heights
        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.printf("Mean height: %.2f cm%n", meanHeight(heights));
    }
}
