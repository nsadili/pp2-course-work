import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int sum = 0;
    int count = 0;

    while (input.hasNextDouble()) {
      sum += input.nextDouble();
      count++;
    }

    if (count == 0) {
      System.out.println("Error: No input entered.");
    } else {
      double average = sum / count;
      System.out.println("The average is: " + average);
    }
  }
}
