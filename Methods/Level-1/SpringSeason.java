public class SpringSeason {

    // Method to check if the date is in Spring Season
    public static boolean isSpring(int month, int day) {
        // March 20 – March 31
        if (month == 3 && day >= 20 && day <= 31) return true;
        // April 1 – April 30
        if (month == 4 && day >= 1 && day <= 30) return true;
        // May 1 – May 31
        if (month == 5 && day >= 1 && day <= 31) return true;
        // June 1 – June 20
        if (month == 6 && day >= 1 && day <= 20) return true;

        // Otherwise, not spring
        return false;
    }

    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check for valid month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid month or day entered.");
            return;
        }

        // Check if it's Spring
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
