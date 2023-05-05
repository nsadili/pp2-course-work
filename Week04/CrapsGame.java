package Week04;

import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    private static final int WINNING_ROLLS[] = { 7, 11 };
    private static final int LOSING_ROLLS[] = { 2, 3, 12 };

    private int point;
    private boolean hasPoint;
    private Random random;

    public CrapsGame() {
        random = new Random();
        reset();
    }

    public void reset() {
        point = 0;
        hasPoint = false;
    }

    public int rollDice() {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }

    public boolean playRound() {
        int roll = rollDice();

        if (hasPoint) {
            if (roll == point) {
                reset();
                return true;
            } else if (roll == 7) {
                reset();
                return false;
            }
        } else {
            if (contains(WINNING_ROLLS, roll)) {
                return true;
            } else if (contains(LOSING_ROLLS, roll)) {
                return false;
            } else {
                hasPoint = true;
                point = roll;
            }
        }

        return playRound();
    }

    private boolean contains(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rounds to play: ");
            int numRounds = scanner.nextInt();

            CrapsGame game = new CrapsGame();

            int wins = 0;
            int losses = 0;

            for (int i = 0; i < numRounds; i++) {
                if (game.playRound()) {
                    System.out.println("Round " + (i + 1) + ": WIN");
                    wins++;
                } else {
                    System.out.println("Round " + (i + 1) + ": LOSE");
                    losses++;
                }
            }

            System.out.println("\nResults:");
            System.out.println("Total rounds: " + numRounds);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }
    }
}
