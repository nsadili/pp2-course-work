package Week02.pw.hard;
import java.util.Random;
import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        
        int compNumber;
        int guessNumber;

        System.out.print("Please enter your guess (0 to exit): ");
        while (scan.hasNextInt()) {
            guessNumber = scan.nextInt();
            if (guessNumber == 0)
                break;

            if (guessNumber >= 2 && guessNumber <= 12) {
                compNumber = rand.nextInt(11) + 2; 
                System.out.println("You " + (guessNumber == compNumber ? "won" : "lost") //
                        + "Comp's numb: " + compNumber);
            } else {
                System.out.println("Wrong guess!");
            }
            System.out.print("Enter New Guess: ");
        }

        scan.close();
    }
}
