import java.util.Scanner;

public class HangMan {
    private String word;
    private StringBuilder guessed;
    private int remainingAttempts;

    public HangMan(String word, int maxAttempts) {
        this.word = word.toLowerCase();
        this.remainingAttempts = maxAttempts;
        this.guessed = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                this.guessed.append("_");
            } else {
                this.guessed.append(word.charAt(i));
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (remainingAttempts > 0 && guessed.toString().contains("_")) {
            System.out.println("The word: " + guessed);
            System.out.println("Tries left: " + remainingAttempts);
            System.out.print("Input a letter: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
                System.out.println("You should enter one letter only.");
                continue;
            }

            if (word.contains(guess)) {
                updateGuessed(guess.charAt(0));
                System.out.println("Correct");
            } else {
                remainingAttempts--;
                System.out.println("Wrong");
            }
        }

        scanner.close();

        if (remainingAttempts == 0) {
            System.out.println("Game Over. The word: " + word);
        } else {
            System.out.println("Win. The word: " + word);
        }
    }

    private void updateGuessed(char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessed.setCharAt(i, letter);
            }
        }
    }

    public static void main(String[] args) {
        String word = "hangman";
        int maxAttempts = 6;

        HangMan game = new HangMan(word, maxAttempts);
        game.play();
    }
}
