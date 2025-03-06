package Games;

import java.util.Scanner;
import java.util.Random;

public class Game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();


            String computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win! " + "Your choice: " + userChoice + ", Computer's choice: " + computerChoice);
            } else {
                System.out.println("Computer wins! " + "Your choice: " + userChoice + ", Computer's choice: " + computerChoice);
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}