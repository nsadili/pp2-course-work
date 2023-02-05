import java.util.Scanner;

public class Fact {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    if (num < 0) {
      System.out.println("Error: negative number");
      return;
    }

    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }

    System.out.println("The factorial of " + num + " is " + result);
  }
}
