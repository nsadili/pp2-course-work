public class RollingDie {
    public static void main(String[] args) {
        // generate a random number between 0 and 1
        double rand = Math.random();

        int value;

        // assign values based on probabilities
        if (rand < 0.125) {
            value = 1;
        } else if (rand < 0.25) {
            value = 2;
        } else if (rand < 0.375) {
            value = 3;
        } else if (rand < 0.5) {
            value = 4;
        } else if (rand < 0.75) {
            value = 5;
        } else {
            value = 6;
        }

        System.out.println("The die roll is: " + value);
    }
}

