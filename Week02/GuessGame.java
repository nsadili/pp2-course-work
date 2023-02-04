import java.util.Scanner;

public class GuessGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the maximum number: ");
    int max = sc.nextInt();
    int random = (int) (Math.random() * max + 1);
    int attempts = 0;
    while (true) {
      System.out.println("Guess the number between 1 and " + max + ": ");
      int guess = sc.nextInt();
      attempts++;

      if (guess == random) {
        System.out.println("You win! The number was " + random);
        System.out.println("You took " + attempts + " attempts to guess the number correctly.");
        break;
      } else if (guess < random) {
        System.out.println("The number is HIGHER.");
      } else {
        System.out.println("The number is LOWER.");
      }
    }

    sc.close();
  }
}
