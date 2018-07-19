package rockpaperscissors;

import java.util.Random;

public class consoleGame {

    public static void main(String[] args) {

        String[] options = {"Rock", "Paper", "Scissors"};

        Random rand = new Random();

        int userScore = 0, compScore = 0;

        while (userScore < 2 && compScore < 2) {
            int compChoice = rand.nextInt(3), userChoice = rand.nextInt(3);

            while (userChoice == compChoice) {
                compChoice = rand.nextInt(3);
            }

            if (options[userChoice].equals("Rock") && options[compChoice].equals("Scissors")) {
                userScore++;
            } else if (options[userChoice].equals("Paper") && options[compChoice].equals("Rock")) {
                userScore++;
            } else if (options[userChoice].equals("Scissors") && options[compChoice].equals("Paper")) {
                userScore++;
            } else {
                compScore++;
            }
        }
        if (userScore > compScore) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }

}
