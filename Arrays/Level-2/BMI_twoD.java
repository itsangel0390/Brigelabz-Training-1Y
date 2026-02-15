import java.util.Scanner;

class BMI_twoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of persons: ");
        int person = sc.nextInt();
        double[][] data = new double[person][3];
        String[] weightStatus = new String[person];
        for (int i = 0; i < person; i++) {
            System.out.println("enter details: " + (i + 1));
            do {
                System.out.println("weight(kg): ");
                data[i][0] = sc.nextDouble();
                if (data[i][0] <= 0) {
                    System.out.println("Invalid Input!");
                }
            } while (data[i][0] <= 0);
            do {
                System.out.println("height(cm): ");
                data[i][1] = sc.nextDouble();
                if (data[i][1] <= 0) {
                    System.out.println("Invalid Input");
                }
            } while (data[i][1] <= 0);
        }
        for (int i = 0; i < person; i++) {
            double hM = data[i][1] / 100;
            data[i][2] = data[i][0] / (hM * hM);
            if (data[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (data[i][2] >= 25.0 && data[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("BMI details:");
        for (int i = 0; i < person; i++) {
            System.out.println("Person : " + (i + 1));
            System.out.println("Weight : " + data[i][0]);
            System.out.println("Height : " + data[i][1]);
            System.out.println("BMI : " + String.format("%.2f", data[i][2]));
            System.out.println("Status : " + weightStatus[i]);
        }
    }
}