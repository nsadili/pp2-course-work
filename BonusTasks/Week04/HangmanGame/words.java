package BonusTasks.Week04.HangmanGame;

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

    static Random w = new Random();
    static int a = w.nextInt(word.length);
    static char gameword[] = word[a].toCharArray();
    static char hiddenword[] = word[a].toCharArray();

    static char[] x;

    static Scanner sc = new Scanner(System.in);

    public static void scan() {
        String newchar = sc.nextLine();
        x = newchar.toCharArray();
    }

    public static void menu() {
        System.out.println("Hello User" +
                "\nThis is a Hangman Game" +
                "\nLet's Start with you and see who will win" +
                "\nYou have " + hearts + " chance (hearts) to give wrong answer" +
                "\nOtherwise, You die." +
                "\nI am thinking about new word" +
                "\nI have found, Let's Start");
    }

    public static void default_() {
        hearts = 7;
        count = 0;
        endgame = 0;
        a = w.nextInt(word.length);
        gameword = word[a].toCharArray();
        hiddenword = word[a].toCharArray();
    }

    public static void start() {
        default_();
        hideWord();
        while (true) {
            endgame = 0;
            for (int i = 0; i < hiddenword.length; i++)
                if (hiddenword[i] == '_')
                    endgame++;
            if (hearts == 0 || endgame == 0)
                break;
            printProccess();
            scan();
            check();
        }
        printLastThings();
    }

    public static void printProccess(){
        System.out.println("----------------------------------------------------");
        System.out.println("You have " + hearts + " hearts left");
        System.out.print("Please, enter a character: ");
    }

    public static void hideWord(){
        for (int i = 0; i < hiddenword.length; i++) {
            hiddenword[i] = '_';
        }
        toString(hiddenword);
    }

    public static void printLastThings() {
        System.err.println("----------------------------------------------------");

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

    public static void check() {
        if (x.length > 1) {
            try {
                throw new MyException();
            } catch (Exception ex) {
                System.out.println("Only 1 character requires");
                toString(hiddenword);

            }
        } else if (x[0] >= 48 && x[0] <= 57) {
            try {
                throw new MyException();
            } catch (Exception ex) {
                System.out.println("It must not be a number");
                toString(hiddenword);

            }
        } else if (x[0] == ' ') {
            try {
                throw new MyException();
            } catch (Exception ex) {
                System.out.println("You can not enter space");
                toString(hiddenword);

            }
        } else {
            count = 0;
            for (int i = 0; i < hiddenword.length; i++) {
                if (gameword[i] == x[0]) {
                    System.out.println("Congratulations!, You found correct character!");
                    hiddenword[i] = x[0];
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Oh no, dear, You lost your 1 heart");
                hearts--;
            }
            toString(hiddenword);
            pictures.picture(hearts);
        }
    }
}
