import java.util.*;

public class GameOfCraps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double bet = sc.nextDouble();
        int point = 0;
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        int sum = roll1 + roll2;

        System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);

        if (sum == 7 || sum == 11) {
            System.out.println("You win!");
            bet *= 2;
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose!");
            bet = 0;
        } else {
            point = sum;
            System.out.println(point);
            while (true) {
                roll1 = rand.nextInt(6) + 1;
                roll2 = rand.nextInt(6) + 1;
                sum = roll1 + roll2;
                System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
                if (sum == point) {
                    System.out.println("You win!");
                    bet *= 2;
                    break;
                } else if (sum == 7) {
                    System.out.println("You lose!");
                    bet = 0;
                    break;
                }
            }
        }

        System.out.println("Your winnings: $" + bet);
    }
}
