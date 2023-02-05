import java.util.Random;

public class RollingDie {
    public static void main(String[] args) {
        Random random = new Random();
        int roll = random.nextInt(8);

        if (roll < 4) {
            System.out.println(roll + 1);
        }
        else {
            System.out.println(4 + random.nextInt(2));
        }
    }
}
//i am not sure if it is correct