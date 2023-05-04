import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        int targetNum = (int) (Math.random() * maxNum) + 1;
        int guess, numAttempts = 0;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.print("Guess a number between 1 and " + maxNum + ": ");
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
                numAttempts++;
                if (guess == targetNum) {
                    System.out.println("Congratulations! You guessed the number in " + numAttempts + " attempts.");
                    gameOver = true;
                } else if (guess < targetNum) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and " + maxNum + ".");
                sc.next();
            }
        }
        sc.close();
    }
}
