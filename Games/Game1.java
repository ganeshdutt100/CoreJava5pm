package Games;

import java.util.Scanner;
import java.util.Random;
public class Game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("Enter your choice (rock/paper/scissors) ");
        String userChoice = scanner.nextLine().toLowerCase();
        String computerChoice = choices[random.nextInt(choices.length)];
//        System.out.println(computerChoice);

        if(     (userChoice == "rock" &&  computerChoice == "scissors") ||
                (userChoice == "paper" &&  computerChoice == "rock") ||
                (userChoice == "scissors" &&  computerChoice == "paper") ){
            System.out.println("User Win " + " userChoice : "+ userChoice + " "+  "computerChoice" +  computerChoice);
        }
        else{

            System.out.println("Computer Win " + " userChoice : "+ userChoice + " "+  "computerChoice :  " +  computerChoice);
        }



        scanner.close();
    }
}

