import java.util.Scanner;

class StudentScoreCard {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[1][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;
            avg = Math.round(avg * 100.0) / 100.0;
            per = Math.round(per * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = per;
        }
        return result;
    }

    public static String[] calculateGrade(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double per = result[i][2];

            if (per >= 80)
                grades[i] = "A";
            else if (per >= 70 && per <= 79)
                grades[i] = "B";
            else if (per >= 60 && per <= 69)
                grades[i] = "C";
            else if (per >= 50 && per <= 59)
                grades[i] = "D";
            else if (per >= 40 && per <= 49)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    // Method 4: Display Scorecard
    public static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {

        System.out.println("\nStudent Scorecard");
        System.out.println("--------------------------------------------------------------");
        System.out.println("No\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + " " +
                    scores[i][0] + " " +
                    scores[i][1] + " " +
                    scores[i][2] + " " +
                    result[i][0] + " " +
                    result[i][1] + " " +
                    result[i][2] + " " +
                    grades[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);

        double[][] result = calculateResults(scores);

        String[] grades = calculateGrade(result);

        displayScoreCard(scores, result, grades);
    }
}