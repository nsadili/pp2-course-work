import java.util.Scanner;

public class PolarityOfNumber {
  public static void main(String[] args){

    Scanner n = new Scanner(System.in);

    double number = n.nextDouble();

    if (number > 0){
        System.out.println("positive");
    }
    if (number < 0){
        System.out.println("negative");
    }
    if (number == 0){
        System.out.println("neutral");
    }

  }
}