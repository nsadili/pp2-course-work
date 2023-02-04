import java.util.Scanner;

public class DiceMan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number between 2 and 12 (or 0 to quit): ");
      int userNumber = sc.nextInt();

      if (userNumber == 0) {
        System.out.println("Goodbye!");
        break;
      } else if (userNumber < 2 || userNumber > 12) {
        System.out.println("Invalid input. Please enter a number between 2 and 12.");
        continue;
      }

      int dice1 = (int) (Math.random() * 6 + 1);
      int dice2 = (int) (Math.random() * 6 + 1);
      int total = dice1 + dice2;

      System.out.println("Computer throws two dice: " + dice1 + " and " + dice2);

      if (total == userNumber) {
        System.out.println("You win!");
      } else {
        System.out.println("Computer wins.");
      }
    }

    sc.close();
  }
}
 
    

