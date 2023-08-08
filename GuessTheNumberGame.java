import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have generated a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess what it is?");

        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! Your guess is correct.");
            } else if (userGuess < generatedNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        } while (userGuess != generatedNumber);

        scanner.close();
    }

    @Override
    public String toString() {
        return "GuessTheNumberGame []";
    }
}
