import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the word to be guessed: ");
            String word = scanner.nextLine().toLowerCase().trim().replaceAll("\\s", "");

            while (word.contains(" ")) {
                System.out.print("\nPlease enter a single word: ");
                word = scanner.nextLine().toLowerCase().trim().replaceAll("\\s", "");
            }

            char[] guessedLetters = new char[word.length()];
            int remainingGuesses = 6;
            boolean gameOver = false;

            System.out.println("\nWelcome to Hangman!");
            System.out.println("\nThe word has " + word.length() + " letters.");
            System.out.println("\nYou have " + remainingGuesses + " incorrect guesses remaining.");

            while (!gameOver) {
                System.out.println("─────────────────────────────────────────────");
                System.out.print("Guessed letters: ");
                for (char letter : guessedLetters) {
                    System.out.print(letter == 0 ? "_ " : letter + " ");
                }
                System.out.println("\n─────────────────────────────────────────────");

                switch (remainingGuesses) {
                    case 6:
                        System.out.println("  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========");
                        break;
                    case 5:
                        System.out.println("  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========");
                        break;
                    case 4:
                        System.out.println("  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========");
                        break;
                    case 3:
                        System.out.println("  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========");
                        break;
                    case 2:
                        System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========");
                        break;
                    case 1:
                        System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========");
                        break;
                    case 0:
                        System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========");
                        break;
                }

                System.out.print("\nGuess a letter: ");
                char guess = scanner.next().toLowerCase().charAt(0);

                boolean found = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessedLetters[i] = guess;
                        found = true;
                    }
                }

                if (!found) {
                    remainingGuesses--;
                    System.out.println("\nSorry, that letter is not in the word.");
                    if (remainingGuesses > 0) {
                        System.out.println("\nYou have " + remainingGuesses + " incorrect guesses remaining.");
                    }
                } else {
                    System.out.println("\nGreat guess!");
                }

                boolean win = true;
                for (char letter : guessedLetters) {
                    if (letter == 0) {
                        win = false;
                        break;
                    }
                }

                if (win) {
                    System.out.println("\nCongratulations, you guessed the word!");
                    System.out.println("\nThe word was " + word + ". \n");
                    gameOver = true;
                }
                if (remainingGuesses == 0) {
                    System.out.println("\nGame over, you ran out of guesses!\n");
                    System.out.println("The word was " + word + ".\n");
                    gameOver = true;
                }
            }
        }
    }
}
