import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amar's age: ");
        int ageAmar = sc.nextInt();

        System.out.println("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();

        System.out.println("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.println("Enter Amar's height: ");
        double heightAmar = sc.nextDouble();

        System.out.println("Enter Akbar's height: ");
        double heightAkbar = sc.nextDouble();

        System.out.println("Enter Anthony's height: ");
        double heightAnthony = sc.nextDouble();

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
