import java.util.Random;

public class GameOfCraps {
    public static void main(String[] args) {
        int numRounds = 5; // Number of rounds to play

        playCraps(numRounds);
    }

    public static void playCraps(int numRounds) {
        Random random = new Random();

        for (int i = 1; i <= numRounds; i++) {
            System.out.println("Round " + i + ":");
            int comeOutRoll = rollDice(random);
            System.out.println("Come-out roll: " + comeOutRoll);

            if (comeOutRoll == 7 || comeOutRoll == 11) {
                System.out.println("You win!");
            } else if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12) {
                System.out.println("You lose!");
            } else {
                int point = comeOutRoll;
                System.out.println("Point established: " + point);

                boolean win = false;
                while (true) {
                    int roll = rollDice(random);
                    System.out.println("Roll: " + roll);

                    if (roll == point) {
                        win = true;
                        break;
                    } else if (roll == 7) {
                        break;
                    }
                }

                if (win) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }

            System.out.println();
        }
    }

    public static int rollDice(Random random) {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }
}
