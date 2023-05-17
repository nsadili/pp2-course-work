import java.util.Scanner;

public class HangManGame {
    private static final String[] WORDS = { "apple", "banana", "carrot", "durian", "eggplant" };
    private static final int MAX_TRIES = 6;

    private String word;
    private char[] guessedLetters;
    private int triesLeft;

    public void HangmanGame() {
        word = getRandomWord();
        guessedLetters = new char[word.length()];
        triesLeft = MAX_TRIES;
    }

    private String getRandomWord() {
        int index = (int) (Math.random() * WORDS.length);
        return WORDS[index];
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the word:");

        while (true) {
            System.out.println(getCurrentWordState());
            System.out.println("Tries left: " + triesLeft);
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().charAt(0);
            boolean correctGuess = updateGuessedLetters(guess);

            if (!correctGuess) {
                triesLeft--;
                System.out.println("Wrong guess!");
                if (triesLeft == 0) {
                    System.out.println("Game over! You ran out of tries.");
                    System.out.println("The word was: " + word);
                    break;
                }
            }

            if (isWordGuessed()) {
                System.out.println(getCurrentWordState());
                System.out.println("Congratulations! You guessed the word.");
                break;
            }
        }

        scanner.close();
    }

    private String getCurrentWordState() {
        StringBuilder sb = new StringBuilder();

        for (char c : guessedLetters) {
            if (c != '\0') {
                sb.append(c);
            } else {
                sb.append("_");
            }
            sb.append(" ");
        }

        return sb.toString();
    }

    private boolean updateGuessedLetters(char guess) {
        boolean correctGuess = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedLetters[i] = guess;
                correctGuess = true;
            }
        }

        return correctGuess;
    }

    private boolean isWordGuessed() {
        for (char c : guessedLetters) {
            if (c == '\0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HangManGame game = new HangManGame();
        game.play();
    }
}
