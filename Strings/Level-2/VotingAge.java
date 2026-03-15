import java.util.Scanner;
import java.util.Random;

class VotingAge {
    public static int[] ageArr(int n) { // Method to generate random 2-digit ages
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(90) + 10; // create random 2digit num(10-99)
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age); // store age(int) as String
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Eligibility: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Student: ");
        int n = sc.nextInt();
        int[] ages = ageArr(n);
        String[][] result = checkVoting(ages);
        display(result);
    }
}
