import java.util.*;

public class HangmanGame {
    public static void main(String[] args) {
        String[] words = { "language", "programming", "java", "javascript", "algorithm", "coding", "syntax" };
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        int numIncorrectGuesses = 0;
        char[] guessedLetters = new char[word.length()];
        
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");

        while (numIncorrectGuesses < 10) {

            System.out.println("Word: " + String.valueOf(guessedLetters));
            System.out.println("Number of incorrect guesses: " + numIncorrectGuesses);

            System.out.print("Guess a letter: ");
            char guess = sc.nextLine().charAt(0);

            boolean letterFound = false;
            for (int i = 0; i < word.length(); i++) {
                if (guess == word.charAt(i)) {
                    guessedLetters[i] = guess;
                    letterFound = true;
                }
            }

            if (!letterFound) {
                numIncorrectGuesses++;
            }

            if (String.valueOf(guessedLetters).equals(word)) {
                System.out.println("Congratulations, you won!");
                System.out.println("The word was: " + word);
                break;
            }
        }

        if (numIncorrectGuesses == 10) {
            System.out.println("Sorry, you lost!");
            System.out.println("The word was: " + word);
        }
    }
}
