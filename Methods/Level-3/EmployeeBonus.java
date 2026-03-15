import java.util.Random;

public class EmployeeBonus {

    // Method to generate salary (5-digit) and years of service (1-10) for 10 employees
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [][0] = salary, [][1] = yearsOfService
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 10000 to 99999
            data[i][1] = 1 + rand.nextInt(10);        // 1 to 10 years of service
        }
        return data;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [][0] = new salary, [][1] = bonus

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate total old salary, new salary, and total bonus
    public static void displaySummary(int[][] employeeData, double[][] salaryBonusData) {
        int totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = salaryBonusData[i][1];
            double newSalary = salaryBonusData[i][0];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t\t%d\t\t%d\t%.2f\t\t%.2f%n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total\t\t%d\t\t\t%.2f\t\t%.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate random salaries and years of service
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate bonus and new salary
        double[][] salaryBonusData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display all data and totals in tabular format
        displaySummary(employeeData, salaryBonusData);
    }
}
