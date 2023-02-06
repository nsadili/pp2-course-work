import java.util.Scanner;

public class SumOfOdd {
  public static void main(String[] args) {

    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);

    int x = a.nextInt();
    int y = b.nextInt();

    int i;
    int sum = 0;

    for (i=x; i<=y; i++){
        if (i%2==1){
            sum += i;
        }
    }

    System.out.printf("Sum of odd numbers between %d and %d is: %d", x, y, sum);

  }
}