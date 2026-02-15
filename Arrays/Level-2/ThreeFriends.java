import java.util.Scanner;

class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] age = new int[3];
        double[] h = new double[3];
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter age and height: " + names[i]);
            age[i] = sc.nextInt();
            h[i] = sc.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (h[i] > h[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("Youngest friend: " + names[youngestIndex] + "Age: " + age[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex] + "Height: " + h[tallestIndex]);
    }
}
