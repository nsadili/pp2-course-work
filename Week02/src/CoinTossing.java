import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Heads = 0;
        int Tails = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                Heads++;
            } else {
                Tails++;
            }
        }

        System.out.println("Number of heads: " + Heads);
        System.out.println("Number of tails: " + Tails);
        System.out.println("Probability of heads: " + (double) Heads / n);
        System.out.println("Probability of tails: " + (double) Tails / n);
    }
}
