import java.util.Scanner;
import java.util.Random;
public class DiceMan {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Random rand = new Random();
    int compAnswer = rand.nextInt(11) + 2;
    int userAnswer = scn.nextInt();
    if(userAnswer>12 || userAnswer==1) {
        System.out.println("You can't get "+userAnswer+" with two dice");
    }
    else {
        if(userAnswer == compAnswer) {
            System.out.println("You Won!!!");
            System.out.println("The number was "+compAnswer);
        }
        else {
            System.out.println("You Lost(");
            System.out.println("The number was "+compAnswer);
        }
    }
  }
}