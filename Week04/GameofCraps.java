import java.util.Random;

public class GameofCraps {
    public static void main(String[] args) {
        Random random = new Random();
        int wins = 0;
        int losses = 0;
        int n = 100;
        for (int i = 0; i < n; i++) {
            int roll1 = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            int sum = roll1 + roll2;
            if (sum == 7 || sum == 11) {
                wins++;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                losses++;
            } else {
                int point = sum;
                boolean sevenOut = false;
                while (true) {
                    roll1 = random.nextInt(6) + 1;
                    roll2 = random.nextInt(6) + 1;
                    sum = roll1 + roll2;
                    if (sum == 7) {
                        sevenOut = true;
                        break;
                    }
                    if (sum == point) {
                        break;
                    }
                }
                if (sevenOut) {
                    losses++;
                } else {
                    wins++;
                }
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}









