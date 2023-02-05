import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int limit = scn.nextInt();
        int compAnswer = rand.nextInt(limit);
        int attempts_value = 11;
        int attempts = 10;
        System.out.println("Computer guessed a number between 0 and "+limit+", try to guess it)\n");
        while(true) {
            System.out.print("Guess the number: ");
            int userAnswer = scn.nextInt();
            if(userAnswer > compAnswer) {
                attempts--;
                System.out.println("Lower");
                System.out.println(attempts+" attempts left\n");
            } else if(userAnswer < compAnswer) {
                attempts--;
                System.out.println("Higher");
                System.out.println(attempts+" attempts left\n");
            } else {
                System.out.println("You Got It!!");
                System.out.println("The number was "+compAnswer);
                System.out.println("You did it in "+(attempts_value-attempts)+" attempts");
                break;
            }
            if(attempts==0) {
                System.out.println("You Lost!");
                break;
            }
        }
    }
}
