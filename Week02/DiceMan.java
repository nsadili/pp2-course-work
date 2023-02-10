import java.util.Random;

public class DiceMan {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);

        if(n == 0){
            System.out.println("Please enter a value from 2 to 12");
            System.exit(0);
        }
        if(n < 2 || n > 12){
            System.out.println("this value can't be obtained with two dice");
            System.exit(0);
        }

        Random rand = new Random();
        int dice = rand.nextInt(11) + 2; // [0-10] + 2 = [2-12]

        if(dice == n) System.out.println("You win!");
        else System.out.println("You lose");
    }
}
