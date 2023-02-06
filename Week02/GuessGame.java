import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int guess = 0;
        while (guess != num) {
            System.out.println("Enter a guess: ");
            guess = input.nextInt();
            if (guess == num) {
                System.out.println("You win!");
            } else if (guess > num) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
        }
    }
}

