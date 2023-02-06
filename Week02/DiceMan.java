import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int sum = dice1 + dice2;
        if (num == 0) {
            System.out.println("Game over");
        } else if (num > 12) {
            System.out.println("Error");
        } else if (num == sum) {
            System.out.println("Player wins");
        } else {
            System.out.println("Computer wins");
        }
    }
}

