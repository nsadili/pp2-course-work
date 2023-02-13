import java.util.Scanner;

public class CoinTossing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
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
    
    System.out.println(heads + tails);
    System.out.println((double)heads/n);
    System.out.println((double)tails/n);
  }
}
