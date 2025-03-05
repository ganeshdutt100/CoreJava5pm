package Games;

import java.util.Random;

public class random {
    public static void main(String[] args) {
//
        Random random = new Random();
//        int randomNumber = random.nextInt(5);
//        System.out.println(randomNumber);

        String [] options ={ "rock", "paper", "scissors"};


//        String randomName = options[random.nextInt(options.length)];
//        System.out.println(randomName);
        int randomIndex = random.nextInt(options.length);
        System.out.println(randomIndex);




    }
}
