import java.util.*;

class RockPaperScissors {
    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0)
            return "Rock";
        else if (random == 1)
            return "Paper";
        else {
            return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }
        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
                user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper")) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);
        stats[0][0] = "Computer";
        stats[0][1] = String.valueOf(compWins);
        stats[0][2] = String.format("%.2f", compPercent);
        return stats;
    }

    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("Game result: ");
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + " " + games[i][0] + " " + games[i][1] + " " + games[i][2]);
        }
        System.out.println("Statistics: ");
        System.out.println("Player\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + " " + stats[i][1] + " " + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        String[][] games = new String[n][3];
        int userWins = 0;
        int compWins = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Game: " + (i + 1));
            System.out.print("Enter your choice: ");
            String userChoice = sc.nextLine();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);
            games[i][0] = userChoice;
            games[i][1] = compChoice;
            games[i][2] = winner;
            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;
        }
        String[][] stats = calculateStats(userWins, compWins, n);
        displayResults(games, stats);
    }
}
