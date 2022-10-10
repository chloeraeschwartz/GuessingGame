import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctGuess = 7;
        int userGuess;

        System.out.println("Guess a number (input 0 for the rules, entering -1 will exit): ");
        userGuess = input.nextInt();
        if (userGuess == 0) {
            System.out.println("You have 3 guesses to guess the correct number between 1 and 10: ");
            userGuess = input.nextInt();
        }
        while ((userGuess != correctGuess) && (userGuess != -1)) {
            if(userGuess < correctGuess) {
                System.out.println("That was not correct you're too low, guess again: ");
                userGuess = input.nextInt();
            } else if(userGuess > correctGuess) {
                System.out.println("That was not correct you're too high, guess again: ");
                userGuess = input.nextInt();
            }
        }
        if(userGuess == correctGuess) {
            System.out.println("Correct!");
        }

    }
}