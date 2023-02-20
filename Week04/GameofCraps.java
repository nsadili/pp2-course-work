import java.util.Random;

public class GameofCraps{
    public static void main(String[] args) {
        Random random = new Random();
        int point = 0;

        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int sum = roll1 + roll2;

        if(sum == 7 || sum == 11){
            System.out.println("Bet win");
        } else if (sum == 2 || sum == 12|| sum == 3) {
            System.out.println("Bet lose");
        } else sum = point;

        while(point != 0) {
            roll1 = random.nextInt(6) + 1;
            roll2 = random.nextInt(6) + 1;
            sum = roll1 + roll2;

            if(sum == point){
                System.out.println("Bet win");
                break;
            } else if (sum == 7) {
                System.out.println("Bet lose");
                break;
            } 
        }
    }
}