package Week07;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("  : " ); 
    int n = scanner.nextInt();
    scanner.close();
    try {
      int factorial = factorial(n);
      System.out.printf("%d! = %d%n", n, factorial);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  public static int factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Input must be non-negative");
    }
    int product = 1;
    for (int i = n; i >= 1; i--) {
      product *= i;
    }
    return product;
  }

}
