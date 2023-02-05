import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number!");
        int A = sc.nextInt();
        int random = 1+ (int)(A*Math.random());
        System.out.println("Guess the number!");
        var YourGuess=0;
        var YourScore=0;

        while (sc.hasNextInt())
        {
            YourGuess=sc.nextInt();
            YourScore++;
            if (YourGuess==random) 
            {
                System.out.println("Good Job!!!");
                System.exit(A);
            }
              else
            if (YourGuess<random) System.out.println("HIGHER!"); else 
            if (YourGuess>random) System.out.println("LOWER!");
        }
        System.out.println("GAME OVER!");
        System.out.printf("Number was %d\n", random);
        System.out.printf("SCORE: %d", YourScore);
    }
}
