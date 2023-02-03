import java.util.Scanner;

class DiceMan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Guess the number: ");
      int userNumber = sc.nextInt();
      if (userNumber == 0) {
        break;
      } else if (userNumber < 2 || userNumber > 12) {
        System.out.println("Error: impossible number.");
        continue;
      }

      int dice1 = (int) (Math.random() * 6 + 1);
      int dice2 = (int) (Math.random() * 6 + 1);
      int total = dice1 + dice2;

      System.out.println("First dice: " + dice1 + ", Second dice: " + dice2 + ", Total: " + total);
      if (total == userNumber) {
        System.out.println("User wins!");
      } else {
        System.out.println("Computer wins.");
      }
    }

    sc.close();
  }
}
