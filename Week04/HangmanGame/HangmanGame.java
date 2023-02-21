package Week04.HangmanGame;

import java.util.Scanner;

public class HangmanGame {

    private static final String[] WORDS = {"apple", "banana", "cherry", "orange", "pear", "strawberry"};
    private static final int MAX_TRIES = 6;

    public static void main(String[] args) {
        String word = getRandomWord();
        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '-';
        }

        int numTries = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        while (true) {
            System.out.print("The word: ");
            printArray(hiddenWord);
            System.out.print("Enter a letter: ");
            String input = sc.nextLine();
            if (input.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }
            char letter = input.charAt(0);
            if (alreadyGuessed(hiddenWord, letter)) {
                System.out.println("You've already guessed that letter!");
                continue;
            }
            if (word.indexOf(letter) == -1) {
                System.out.println("Sorry, that letter is not in the word.");
                numTries++;
            } else {
                System.out.println("Good guess!");
                updateHiddenWord(word, hiddenWord, letter);
            }
            if (isGameOver(numTries, hiddenWord)) {
                System.out.println("The word was: " + word);
                System.out.println("Game over! You lose.");
                break;
            } else if (isGameWon(hiddenWord)) {
                System.out.println("The word was: " + word);
                System.out.println("Congratulations! You win!");
                break;
            }
        }
        sc.close();
    }

    private static String getRandomWord() {
        int index = (int) (Math.random() * WORDS.length);
        return WORDS[index];
    }

    private static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static boolean alreadyGuessed(char[] array, char letter) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                return true;
            }
        }
        return false;
    }

    private static void updateHiddenWord(String word, char[] hiddenWord, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                hiddenWord[i] = letter;
            }
        }
    }

    private static boolean isGameOver(int numTries, char[] hiddenWord) {
        return numTries == MAX_TRIES || new String(hiddenWord).indexOf('-') == -1;
    }

    private static boolean isGameWon(char[] hiddenWord) {
        return new String(hiddenWord).indexOf('-') == -1;
    }
}
