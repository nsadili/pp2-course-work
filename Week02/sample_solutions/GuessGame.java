import java.util.Random;
import java.util.Scanner;

/**
 * To compile: javac -d ./classes .\GuessGame.java <br />
 * To execute: java -cp .\classes\ GuessGame <br />
 * <br />
 * TASK: modify the code to have multiple rounds of guess game until user wants
 * to exit. <br />
 * After each finished round, ask user if s/he would like to continue. User
 * might want to exit by answering "no" to the question or by entering "end of
 * file flag" anytime
 * 
 * @author Nuraddin Sh. Sadili
 */

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the upper bound: ");
        int upperBound = scan.nextInt();

        int compsNumber = rand.nextInt(upperBound) + 1;

        System.out.print("Enter your guess: ");
        if (!scan.hasNextInt()) {
            System.out.println("You lost.");
            System.exit(0);
        }
        int guess = scan.nextInt();

        while (compsNumber != guess) {
            if (compsNumber < guess)
                System.out.println("Too high.");
            else
                System.out.println("Too low.");

            System.out.print("Enter your guess: ");
            if (!scan.hasNextInt()) {
                System.out.println("You lost.");
                System.exit(0);
            }
            guess = scan.nextInt();
        }

        System.out.println("You won.");

        scan.close();
    }
}
