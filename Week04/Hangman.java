import java.util.Scanner;
import java.util.Random;

public class Hangman {

    private static String[] words = {"computer", "programming", "java", "algorithm", "database", "networking"};
    private static Random random = new Random();
    private static String word = words[random.nextInt(words.length)];
    private static char[] guessedWord = new char[word.length()];
    private static int maxAttempts = 6;
    private static int attemptsLeft = maxAttempts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        initializeGuessedWord();

        while (attemptsLeft > 0) {
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.println("Word: " + String.valueOf(guessedWord));

            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (guessInWord(guess)) {
                System.out.println("Good guess!");
                if (wordGuessed()) {
                    System.out.println("You won!");
                    return;
                }
            } else {
                System.out.println("Bad guess!");
                attemptsLeft--;
            }
        }

        System.out.println("You lost! The word was: " + word);
    }

    private static void initializeGuessedWord() {
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
    }

    private static boolean guessInWord(char guess) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedWord[i] = guess;
                found = true;
            }
        }
        return found;
    }

    private static boolean wordGuessed() {
        for (int i = 0; i < guessedWord.length; i++) {
            if (guessedWord[i] == '_') {
                return false;
            }
        }
        return true;
    }
}