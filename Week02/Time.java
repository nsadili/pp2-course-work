import java.util.Scanner;

public class Time {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input seconds: ");
    int number = in.nextInt();
    int  seconds = number % 60;
    int hours = number / 60;
    int minutes = hours % 60;
    hours = hours / 60;
    System.out.print(hours + ":" + minutes + ":" + seconds);
    System.out.print("\n");
  }
}