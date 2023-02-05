import java.util.Random;

public class RollingDie {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(8) + 1;
        if (result > 4) {
            result = random.nextInt(2) + 5;
        }
        System.out.println(result);
    }
}