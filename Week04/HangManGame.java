import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        String[] letters = word.split("");
        String[] guessed = new String[letters.length];
        for (int i = 0; i < letters.length; i++) {
            guessed[i] = "_";
        }
        int guesses = 0;
        while (true) {
            System.out.println("Guess a letter: ");
            String guess = sc.nextLine();
            boolean correct = false;
            for (int i = 0; i < letters.length; i++) {
                if (letters[i].equals(guess)) {
                    guessed[i] = guess;
                    correct = true;
                }
            }
            if (!correct) {
                guesses++;
            }
            for (int i = 0; i < guessed.length; i++) {
                System.out.print(guessed[i] + " ");
            }
            System.out.println();
            if (guesses == 6) {
                System.out.println("You lose!");
                break;
            }
            boolean won = true;
            for (int i = 0; i < guessed.length; i++) {
                if (guessed[i].equals("_")) {
                    won = false;
                }
            }
            if (won) {
                System.out.println("You win!");
                break;
            }
        }
    }
}