import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    var sum = 0;
    var cnt = 0;

    while (scan.hasNextInt()) {
      sum += scan.nextInt();
      cnt++;
    }

    var avg = (double) sum / cnt;

    System.out.println(avg);
  }
}