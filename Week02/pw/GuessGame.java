import java.util.Random;
import java.util.Scanner;

public class GuessGame {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Random rand = new Random();

    System.out.print("Enter the upper bound: ");

    int upperBound = scan.nextInt();

    int compsNumber = rand.nextInt(upperBound) + 1;

    System.out.print("Enter your guess: ");

    if (!scan.hasNextInt()) {

      System.out.println("You lost.");

      System.exit(0);
    }
    int guess = scan.nextInt();

    while (compsNumber != guess) {

      if (compsNumber < guess)
        System.out.println("Too high.");

      else
        System.out.println("Too low.");


      System.out.print("Enter your guess: ");

      if (!scan.hasNextInt()) {

        System.out.println("You lost.");

        System.exit(0);
      }
      guess = scan.nextInt();
    }

    System.out.println("You won.");

    scan.close();
  }
}

