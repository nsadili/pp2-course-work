import java.util.Scanner;

public class CoinTossing {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter the number of coin tosses: ");
    int n = sc.nextInt();
    
    int heads = 0;
    int tails = 0;
    
    for (int i = 0; i < n; i++) {
      double result = Math.random();
      if (result < 0.5) {
        heads++;
      } else {
        tails++;
      }
    }
    
    System.out.println("Heads: " + heads + " Tails: " + tails);
    System.out.println("Probability of heads: " + (double)heads/n);
    System.out.println("Probability of tails: " + (double)tails/n);
}
}
}