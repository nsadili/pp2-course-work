import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int sum = 0;
    int cnt = 0;
    while (scn.hasNextInt()) {
        int num = scn.nextInt();
        sum += num;
        cnt++;
    }
    if (cnt == 0) {
      System.out.println("No valid input provided");
    } else {
      System.out.println("Average: " + (double) sum / cnt);
    }
    scn.close();
  }
}

// we haven't covered this topic yet
// i didn't cheated, i just search for eof in java and found this