import java.util.Scanner;

public class PolarityOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a floating-point number: ");
    double num = sc.nextDouble();

    if (num < 0) {
      System.out.println("The number is negative.");
    } else if (num > 0) {
      System.out.println("The number is positive.");
    } else {
      System.out.println("The number is neutral (0).");
    }
  }
}