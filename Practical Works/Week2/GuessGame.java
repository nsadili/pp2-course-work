import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int max = obj.nextInt();
        int randomNumber = (int)(Math.random() * max) + 1;
        int guessCount = 0;
        System.out.println("Guess the number between 1 and " + max + ".");
        while (obj.hasNextInt()) {
            int guess = obj.nextInt();
            guessCount++;

            if (guess == randomNumber) {
                System.out.println("You guessed the number in " + guessCount + " tries");
                return;
            } else if (guess < randomNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
        }
obj.close();
        System.out.println("Exiting program.");
    }
}
