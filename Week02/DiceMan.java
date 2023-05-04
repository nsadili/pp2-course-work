import java.util.Random;
import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();

            int userGuess;
            int computerGuess;

            while (true) {
                System.out.print("Enter your guess (2-12) or 0 to exit: ");
                userGuess = sc.nextInt();

                if (userGuess == 0) {
                    System.out.println("Thanks for playing!");
                    break;
                }

                if (userGuess < 2 || userGuess > 12) {
                    System.out.println("Invalid input! Please enter a value between 2 and 12.");
                    continue;
                }

                int dice1 = random.nextInt(6) + 1;
                int dice2 = random.nextInt(6) + 1;
                computerGuess = dice1 + dice2;

                System.out.println("You guessed: " + userGuess);
                System.out.println("Computer guessed: " + computerGuess);

                if (userGuess == computerGuess) {
                    System.out.println("Congratulations! You won!");
                } else {
                    System.out.println("Sorry, you lost.");
                }
            }
        }
    }
}

