import java.util.Random;
import java.util.Scanner;

public class GameOfCraps {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int wins = 0; 
        int losses = 0;
        
        Random rand = new Random();
        for (int i = 1; i <= n; i++) {
            System.out.println("Round " + i + ":");
            System.out.println();
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int diceSum = die1 + die2;
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("diceSum: " + diceSum);
            
            if (diceSum == 7 || diceSum == 11) {
                System.out.println();
                System.out.println("You win!");
                wins++;
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                System.out.println();
                System.out.println("You lose!");
                losses++;
            } else {
                int point = diceSum;
                System.out.println();
                System.out.println("Points: " + point);
                System.out.println();
                boolean done = false;
                while (!done) {
                    die1 = rand.nextInt(6) + 1; 
                    die2 = rand.nextInt(6) + 1; 
                    diceSum = die1 + die2;
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("diceSum: " + diceSum);
                    System.out.println();
                    if (diceSum == point) {
                        System.out.println("You win!");
                        wins++;
                        done = true;
                    } else if (diceSum == 7) {
                        System.out.println("You lose!");
                        losses++;
                        done = true;
                    }
                }
            }
            System.out.println("-----------------");
        }
        
        System.out.println(n + " Rounds:");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}