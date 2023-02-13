import java.util.Random;

import java.util.Scanner;

public class DiceMan {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int guessedNumber;

    System.out.print("Please enter your guess (0 to exit): ");
    while (scan.hasNextInt()) {
      guessedNumber = scan.nextInt();
      if (guessedNumber == 0)
        break;

      if (guessedNumber >= 2 && guessedNumber <= 12) {
        int compsNumber = rand.nextInt(11) + 2;

        System.out.println("You " + (guessedNumber == compsNumber ? "won" : "lost")
            + "! Comp's numb: " + compsNumber);
      } else {
        System.out.println("You entered an invalid guess!");
      }

      System.out.print("Please enter your new guess (0 to exit): ");
    }

    scan.close();
  }
}
