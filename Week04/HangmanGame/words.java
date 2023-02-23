package HangmanGame;

import java.util.Random;
import java.util.Scanner;

public class words {
    static String word[] = { "computer", "butterfly", "deck", "reflect", "failure",
            "traffic", "example", "shortage", "aunt", "offspring",
            "strong", "model", "concept", "promote", "orientation",
            "copper", "survivor", "evolution", "normal", "partner",
            "revolution", "replacement", "cupboard", "subject", "hero",
            "second", "experience", "experience", "patient", "float",
            "daughter", "timetable", "disability", "disability" };
    static int hearts = 7;
    static int count = 0;
    static int endgame = 0;

    public static void start() {

        System.out.println("Hello User" +
                "\nThis is a Hangman Game" +
                "\nLet's Start with you and see who will win" +
                "\nYou have " + hearts + " chance (hearts) to give wrong answer" +
                "\nOtherwise, You die." +
                "\nI am thinking about new word" +
                "\nI have found, Let's Start");
        Random w = new Random();
        int a = w.nextInt(word.length);
        char gameword[] = word[a].toCharArray();
        char hiddenword[] = word[a].toCharArray();
        for (int i = 0; i < hiddenword.length; i++) {
            hiddenword[i] = '_';
        }
        toString(hiddenword);
        while (true) {
            endgame = 0;
            for (int i = 0; i < hiddenword.length; i++)
                if (hiddenword[i] == '_')
                    endgame++;
            if (hearts == 0 || endgame == 0)
                break;
            System.out.println("----------------------------------------------------");
            System.out.println("You have " + hearts + " hearts");
            System.out.print("Please, enter a character: ");
            Scanner sc = new Scanner(System.in);
            char newchar = sc.next().charAt(0);
            count = 0;
            for (int i = 0; i < hiddenword.length; i++) {
                if (gameword[i] == newchar) {
                    System.out.println("Congratulations!, You found correct character!");
                    hiddenword[i] = newchar;
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Oh no, dear, You lost your 1 hearts");
                hearts--;
            }
            toString(hiddenword);
        }

        System.out.println("----------------------------------------------------");

        if (hearts == 0) {
            System.out.println("Oh no, You can not find correct word" +
                    "\nThe word was: ");
            toString(gameword);
        }

        if (endgame == 0) {
            System.out.println("Congratulations!, You found correct word, with " + hearts + " hearts, keep it up!");
        }

    }

    public static void toString(char[] x) {
        System.out.print("[ ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]");
    }

}
