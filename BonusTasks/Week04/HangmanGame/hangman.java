package BonusTasks.Week04.HangmanGame;

import java.util.Scanner;

public class hangman {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        words.menu();
        while (true) {
            words.start();
            System.out.println("If you want to play again, please, press 1; Otherwise, press 0");
            int c = sc.nextInt();
            if (c == 0) {
                System.out.println("Thank you, for the game.");
                break;
            }
        }
    }
}
