import java.util.Random;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Random rand = new Random();

        double x = rand.nextDouble() * 2 - 1;
        double y = rand.nextDouble() * 2 - 1;

        while (x*x + y*y > 1) {
            x = rand.nextDouble() * 2 - 1;
            y = rand.nextDouble() * 2 - 1;
        }

        System.out.println("Random point inside circle: (" + x + ", " + y + ")");
    }
}
