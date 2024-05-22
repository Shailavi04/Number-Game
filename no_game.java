package Game;

import java.util.*;

class NumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the game of number guessing!");
        boolean repeat;

        do {
            playGame(); // Call the method to play the game
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = in.nextLine();
            repeat= playChoice.equalsIgnoreCase("yes");
        } while (repeat);

        System.out.println("Thanks for playing!");
        in.close();
    }
// Creating a method() named playgame//
    static void playGame() {
        Scanner in = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        System.out.println("Please guess the secret number between 0 and 99.");

        int guess;
        int attempts = 0;
        boolean correct= false;

        do {
            System.out.print("Guess the number between 0-99: ");
            guess = in.nextInt();
            attempts++;
            if (attempts == 6) {
                System.out.println("Sorry! You have reached the maximum attempts. The secret number was " + secretNumber);
                break;
            } else if (guess < secretNumber) {
                System.out.println("Oo awe Too low! Try again");
            } else if (guess > secretNumber) {
                System.out.println("Oo awe Too high! Try again.");
            } else {
                System.out.println("Yay! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
                correct = true;
            }
        } while (!correct);

        in.nextLine(); // Consume newline character after nextInt() to avoid scanner skip issue
    }
}
