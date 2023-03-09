import java.util.Scanner;

public class MinMax {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    float n[] = new float[999];

    int i = 0;

    float max = -99999999;

    float min = 99999999;

    do {
      n[i] = scan.nextFloat();
      max = Math.max(max, n[i]);
      min = Math.min(min, n[i]);
      i++;
    }

    while (scan.hasNextFloat());
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}
