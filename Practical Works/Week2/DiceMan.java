import java.util.Random;
import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        int user = -1;
        while (user != 0) {
            System.out.print("Enter a number: ");
            user = obj.nextInt();

            if (user == 0) {
                System.out.print("The End.");
                break;
            }

            if (user < 2 || user > 12) {
                System.out.println("Enter a value between 2 and 12.");
                continue;
            }

            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int sum = die1 + die2;
            System.out.printf("Computer got: %d and %d (sum: %d)\n", die1, die2, sum);

            if (sum == user) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
