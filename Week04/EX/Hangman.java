import java.util.Scanner;

public class Hangman {
    private static String[] words = {"apple", "banana", "orange", "mango", "pear"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String hiddenWord = new String(new char[word.length()]).replace('\0', '-');
    private static int tries = 10;
    private static String[] hangman = {
        "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        while (tries > 0 && hiddenWord.contains("-")) {
            System.out.println(hangman[10 - tries]);
            System.out.println("Guess a letter (you have " + tries + " tries left): " + hiddenWord);
            String guess = scanner.nextLine();
            if (guess.length() != 1) {
                System.out.println("Please enter only one letter.");
                continue;
            }
            if (!word.contains(guess)) {
                tries--;
                System.out.println("Wrong guess!");
                continue;
            }
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    hiddenWord = hiddenWord.substring(0, i) + guess.charAt(0) + hiddenWord.substring(i + 1);
                }
            }
        }
        if (hiddenWord.equals(word)) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println(hangman[6]);
            System.out.println("Sorry, you ran out of tries. The word was: " + word);
        }
    }
}
