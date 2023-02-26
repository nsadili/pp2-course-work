package Bonus;

import java.util.Random;

public class GameOfCraps {
    public static void main(String[] args) {
        int round = 10; 
        playRounds(round);
    }

    public static void playRounds(int numRounds) {
        Random rand = new Random();
        int wins = 0;
        int loses = 0;
        for (int i = 1; i <= numRounds; i++) {
            int point = 0;
            System.out.println("Round " + i + ":");
            int comeOutRoll = rollDice(rand);
            System.out.println("Come-out roll: " + comeOutRoll);
            if (comeOutRoll == 7 || comeOutRoll == 11) {
                System.out.println("You win!");
                wins++;
            } else if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12) {
                System.out.println("You lose!");
                loses++;
            } else {
                point = comeOutRoll;
                System.out.println("Point established: " + point);
                int roll = rollDice(rand);
                while (roll != point && roll != 7) {
                    System.out.println("Roll: " + roll);
                    roll = rollDice(rand);
                }
                if (roll == point) {
                    System.out.println("You win!");
                    wins++;
                } else {
                    System.out.println("You lose!");
                    loses++;
                }
            }
            System.out.println();
        }
        System.out.println("Results after " + numRounds + " rounds:");
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
    }

    public static int rollDice(Random rand) {
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        return roll1 + roll2;
    }
}
