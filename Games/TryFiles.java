package Games;

import java.util.Scanner;
import java.util.Random;
public class TryFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            // Get player's choice
            System.out.println("\nEnter your choice (rock/paper/scissors) or 'quit' to exit:");
            String playerChoice = scanner.nextLine().toLowerCase();

            // Check if player wants to quit
            if (playerChoice.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate player's input
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please choose rock, paper, or scissors.");
                continue;
            }

            // Computer makes a choice
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            // Show choices
            System.out.println("You chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);

            // Determine winner
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}

