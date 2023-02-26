package practicalwork;

import java.util.Scanner;

public class GameOfHangmang {
	private static final String[] WORDS = { "computer", "java", "programming", "algorithm", "data" };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = getWord();
		int guessesLeft = 6;
		String guessedLetters = "";

		System.out.println("Hangman is welcoming you! The word has " + word.length() + " letters.");

		while (guessesLeft > 0 && !isWordGuessed(word, guessedLetters)) {
			System.out.println("Guesses left: " + guessesLeft);
			System.out.println("Guessed letters: " + guessedLetters);
			System.out.println("Current word: " + getGuessedWord(word, guessedLetters));
			System.out.print("Guess a letter: ");
			String guess = scanner.next().toLowerCase();
			if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
				System.out.println("Invalid input. Please enter a single letter.");
				continue;
			}
			if (guessedLetters.contains(guess)) {
				System.out.println("You already guessed that letter. Please try again.");
				continue;
			}
			guessedLetters += guess;
			if (word.contains(guess)) {
				System.out.println("Correct guess!");
			} else {
				System.out.println("Incorrect guess.");
				guessesLeft--;
			}
		}

		if (isWordGuessed(word, guessedLetters)) {
			System.out.println("Congratulations! You guessed the word: " + word);
		} else {
			System.out.println("Sorry, you lost. The word was: " + word);
		}
	}

	private static String getWord() {
		int index = (int) (Math.random() * WORDS.length);
		return WORDS[index];
	}

	private static boolean isWordGuessed(String word, String guessedLetters) {
		for (int i = 0; i < word.length(); i++) {
			if (!guessedLetters.contains("" + word.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static String getGuessedWord(String word, String guessedLetters) {
		String guessedWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (guessedLetters.contains("" + word.charAt(i))) {
				guessedWord += word.charAt(i);
			} else {
				guessedWord += "_";
			}
			guessedWord += " ";
		}
		return guessedWord.trim();
	}
}