package HangmanGame;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        int b = 1;
        while (b == 1) {
            words.start();

            System.out.println("If you want to play again, please, press 1; Otherwise, press 0");
            try (Scanner sc = new Scanner(System.in)) {
                b = sc.nextInt();
            }

        }
        
        if (b == 0)
            System.out.println("Thank you, for the game.");
    }

}