import java.util.Random;

public class RollingDie {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(8) + 1;
        
        if (num <= 4) {
            System.out.println(num);
        } else {
            int rollAgain = rand.nextInt(2);
            if (rollAgain == 0) {
                System.out.println(5);
            } else {
                System.out.println(6);
            }
        }
    }
}

