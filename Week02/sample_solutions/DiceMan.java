import java.util.Random;
import java.util.Scanner;

/**
 * To compile: javac -d ./classes .\DiceMan.java <br />
 * To execute: java -cp .\classes\ DiceMan <br />
 * <br />
 * TASK: Modify the code so that PLAYER computer plays against the PROGRAM and
 * shows each rounds result. Program terminates when the PLAYER wins.
 * 
 * @author Nuraddin Sh. Sadili
 */

public class DiceMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // int compsNumber = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
        int compsNumber;

        int guessedNumber;

        System.out.print("Please enter your guess (0 to exit): ");
        while (scan.hasNextInt()) {
            guessedNumber = scan.nextInt();
            if (guessedNumber == 0)
                break;

            if (guessedNumber >= 2 && guessedNumber <= 12) {
                compsNumber = rand.nextInt(11) + 2; // [0-10] + 2 = [2-12]

                // if (guessedNumber == compsNumber)
                // System.out.println("You won!");
                // else
                // System.out.println("You lost!");
                System.out.println("You " + (guessedNumber == compsNumber ? "won" : "lost") //
                        + "! Comp's numb: " + compsNumber);
            } else {
                System.out.println("You entered an invalid guess!");
            }

            System.out.print("Please enter your new guess (0 to exit): ");
        }

        scan.close();
    }
}
