package Week04.ex05;
import java.util.Random;

public class GameOfCraps {
    private static final Random random = new Random();

    public static void main(String[] args) {
        playCraps(1); // Play one round of craps
        playCraps(10); // Play ten rounds of craps
    }

    public static void playCraps(int rounds) {
        int wins = 0;
        int losses = 0;
        for (int i = 0; i < rounds; i++) {
            boolean win = playRound();
            if (win) {
                System.out.println("Round " + (i+1) + ": Win");
                wins++;
            } else {
                System.out.println("Round " + (i+1) + ": Loss");
                losses++;
            }
        }
        System.out.println("Total wins: " + wins);
        System.out.println("Total losses: " + losses);
    }

    public static boolean playRound() {
        int roll1 = rollDie();
        int roll2 = rollDie();
        int sum = roll1 + roll2;
        if (sum == 7 || sum == 11) {
            return true;
        } else if (sum == 2 || sum == 3 || sum == 12) {
            return false;
        } else {
            int point = sum;
            while (true) {
                roll1 = rollDie();
                roll2 = rollDie();
                sum = roll1 + roll2;
                if (sum == point) {
                    return true;
                } else if (sum == 7) {
                    return false;
                }
            }
        }
    }

    public static int rollDie() {
        return random.nextInt(6) + 1;
    }
}

