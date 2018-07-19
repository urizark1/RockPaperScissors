package rockpaperscissors;

import java.util.Random;

public class Game {

    Random rand = new Random();

    int compChoice;

    public String run(int userChoice) {
        String[] options = {"Rock", "Paper", "Scissors"};
        compChoice = rand.nextInt(3);

        if (options[userChoice].equals(options[compChoice])) {
            return "It's a TIE!";
        } else if (options[userChoice].equals("Rock") && options[compChoice].equals("Scissors")) {
            return "You WIN!";
        } else if (options[userChoice].equals("Paper") && options[compChoice].equals("Rock")) {
            return "You WIN!";
        } else if (options[userChoice].equals("Scissors") && options[compChoice].equals("Paper")) {
            return "You WIN!";
        } else {
            return "You LOSE!";
        }
    }
}
