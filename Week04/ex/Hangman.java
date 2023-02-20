import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        playGame();

    }

    public static void playGame() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the world");

        var guessWord = sc.nextLine();

        // System.out.println("You have 6 guesses");
        var guess = 6;
        StringBuilder sb = new StringBuilder();
        for (var i = 0; i < guessWord.length(); i++) {
            sb.append("_");
        }
        sb.toString().trim();
        System.out.println(sb);
        String lowerGuess = guessWord.toLowerCase();

        char[] arr = guessWord.toCharArray();
        ArrayList<Character> charList = new ArrayList<Character>();
        while (guess != 0) {

            System.out.printf("You have %d guesses\n", guess);
            System.out.println("Please enter the character");
            char ch = sc.next().toLowerCase().charAt(0);

            if (charList.contains(ch)) {
                System.out.println("You have already entered that character");
                continue;

            }
            charList.add(ch);
            if (lowerGuess.indexOf(ch) != -1) {

                // int index=lowerGuess.indexOf(ch);

                for (var i = 0; i < lowerGuess.length(); i++) {

                    if (lowerGuess.charAt(i) == ch) {
                        sb.setCharAt(i, ch);
                    }
                }

                if (sb.toString().equals(lowerGuess)) {
                    System.out.println("You win, word: " + guessWord);
                    return;
                }

            } else {

                guess--;

            }

            System.out.println(sb);

        }

        System.out.println("You lose:");
        System.out.println("Word is: " + guessWord);
        return;

    }
}
