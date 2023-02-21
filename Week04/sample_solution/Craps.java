import java.util.Random;

public class Craps {

    static final Random rand = new Random();

    static boolean playARound() {

        int roll = rand.nextInt(11) + 2;
        System.out.println("Rolled: " + roll);

        switch (roll) {
            case 7:
            case 11:
                return true;
            case 2:
            case 3:
            case 12:
                return false; // crapping out
            default:
                int point = roll;
                System.out.println("Point established: " + roll);

                while (true) {
                    roll = rand.nextInt(12) + 1;
                    System.out.println("\tRolled again: " + roll);

                    if (roll == 7)
                        return false; // 7 out

                    if (roll == point)
                        return true;
                }

        }
    }

    public static void main(String[] args) {
        System.out.println(playARound() ? "Won" : "Lost");
    }
}
