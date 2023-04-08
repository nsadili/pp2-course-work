import java.util.Random;

public class CrapsGame {

    public static void main(String[] args) {

        int n = 5;
        int wins = 0;
        int losses = 0;

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            System.out.println("Round " + (i + 1) + ":");
            int point = 0;
            boolean hasPoint = false;

            while (true) {
                int roll = random.nextInt(6) + 1 + random.nextInt(6) + 1;
                System.out.println("Roll: " + roll);

                if (!hasPoint) {
                    if (roll == 7 || roll == 11) {
                        System.out.println("You win!");
                        wins++;
                        break;
                    } else if (roll == 2 || roll == 3 || roll == 12) {
                        System.out.println("You lose!");
                        losses++;
                        break;
                    } else {
                        point = roll;
                        hasPoint = true;
                        System.out.println("Point is " + point);
                    }
                } else {
                    if (roll == point) {
                        System.out.println("You win!");
                        wins++;
                        break;
                    } else if (roll == 7) {
                        System.out.println("You lose!");
                        losses++;
                        break;
                    }
                }
            }
        }

        System.out.println("Total wins: " + wins);
        System.out.println("Total losses: " + losses);
    }
}
