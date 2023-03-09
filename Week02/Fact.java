import java.util.Scanner;

public class Fact {
  public static void main(String[] args) {
    int fac = 1;

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();

    for (int i = 1; i <= a; i++) {

      fac = fac * i;

    }

    System.out.print(fac);
  }

}
