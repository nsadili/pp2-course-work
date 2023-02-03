package Easy;
import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    
    while (scan.hasNextInt()) {
      sum += scan.nextInt();
      count++;
    }
    
    if (count == 0) {
      System.out.println("Error: No input entered!");
    } else {
      double average = (double) sum / count;
      System.out.println("The average is: " + average);
    }
    
    scan.close();
  }
}