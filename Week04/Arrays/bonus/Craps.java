package Week04.Arrays.bonus;
import java.util.Random;
import java.util.Scanner;
public class Craps {

    static final Random rand = new Random();

    static boolean playARound() {

        int roll = rand.nextInt(11) + 2;

        switch (roll) {
            case 7:
            case 11:
                return true;
            case 2:
            case 3:
            case 12:
                return false; // crapping out
            default:
                int point = roll;

                while (true) {
                    roll = rand.nextInt(12) + 1;

                    if (roll == 7)
                        return false; // 7 out

                    if (roll == point)
                        return true;
                }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of rounds: ");
        int nbRounds = scan.nextInt();
        int wins = 0, loses = 0;
        boolean result;

        for (int round = 1; round <= nbRounds; round++) {
            result = playARound();
            System.out.printf("The result of round %d is %B. You %s!\n", round, result, (result ? "Won" : "Lost"));
            if (result)
                wins++;
            else
                loses++;
        }

        System.out.println("\tSummary:");
        System.out.printf("Number of wins %d with probability %.2f.\n", wins, (float) wins / nbRounds);
        System.out.printf("Number of loses %d with probability %.2f.\n", loses, (float) loses / nbRounds);

        scan.close();
    }
}

