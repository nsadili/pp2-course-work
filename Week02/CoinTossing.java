import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int heads = 0;
        int tails = 0;
        for (int i = 1; i <= num; i++) {
            double coin = Math.random();
            if (coin < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}

