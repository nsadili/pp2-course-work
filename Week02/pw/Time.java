import java.util.Scanner;

public class Time {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int seconds = input.nextInt();

      int hours = seconds / 3600;
      int minutes = (seconds % 3600) / 60;
      int lastSeconds = seconds % 60;

      System.out.println(hours + ":" + minutes + ":" + lastSeconds);
    }
  }
}