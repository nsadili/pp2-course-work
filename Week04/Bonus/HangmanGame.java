package Bonus;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Hangman Game!");

        String word = selectWord();
        int wordLength = word.length();

        StringBuilder guessedLetters = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            guessedLetters.append('_');
        }

        int remainingTries = 6;
        StringBuilder incorrectGuesses = new StringBuilder();



        while (remainingTries > 0 && guessedLetters.toString().contains("_")) {
            System.out.println("Guess a letter:");
            String letter = input.nextLine();

            if (guessedLetters.toString().contains(letter) || incorrectGuesses.toString().contains(letter)) {
                System.out.println("You have already guessed that letter. Please try again.");
                continue;
            }

            if (word.contains(letter)) {
                for (int i = 0; i < wordLength; i++) {
                    if (word.charAt(i) == letter.charAt(0)) {
                        guessedLetters.setCharAt(i, letter.charAt(0));
                    }
                }
                System.out.println("Correct guess!");
            } else {
                remainingTries--;
                incorrectGuesses.append(letter.charAt(0));
                System.out.println("Incorrect guess. You have " + remainingTries + " tries left.");
            }



            System.out.println("Current status: " + guessedLetters.toString());
            System.out.println("Incorrect guesses: " + incorrectGuesses.toString());
        }



        if (remainingTries == 0) {
            System.out.println("You lose! The word was \"" + word + "\".");
        } else {
            System.out.println("Congratulations! You win!");
        }

        input.close();
    }

    public static String selectWord() {
        String[] words = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew" };
        int index = (int) (Math.random() * words.length);
        return words[index];
    }
}

