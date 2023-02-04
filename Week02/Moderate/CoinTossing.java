package Moderate;
import java.util.Scanner;

public class CoinTossing {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int heads = 0;
    int tails = 0;

    for (int i = 0; i < n; i++) {

      double result = Math.random();

      if (result < 0.5) {
        heads++;
      } 
      else if (result > 0.5) {
        tails++;
      }

      else {
        continue;
      }
    }

    System.out.println((double) heads / n);
    System.out.println((double) tails / n);

    scn.close();
  }
}