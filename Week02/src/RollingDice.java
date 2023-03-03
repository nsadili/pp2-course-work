package Week02.src;

import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random rand = new Random();
        double randomValue = rand.nextInt();
        int result;

        if (randomValue < 1 / 8) {
            result = 1;
        } else if (randomValue < 1 / 8) {
            result = 2;
        } else if (randomValue < 1 / 8) {
            result = 3;
        } else if (randomValue < 1 / 8) {
            result = 4;
        } else if (randomValue < 1 / 4) {
            result = 5;
        } else {
            result = 6;
        }

        System.out.println("The result is: " + result);
    }
}
