import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), heads = 0, tails = 0;
        double cur;
        for (int i = 0; i < n; i++) {
            cur = Math.random();
            if (cur < 0.5) heads++; else tails++;
            System.out.println((i + 1) + ". " + (cur < 0.5 ? "Head" : "Tail"));
        }
        System.out.printf("Probability of heads: %.2f%%\nProbability of tails: %.2f%%\n", (double)heads / n * 100, (double)tails / n * 100);
    }
}