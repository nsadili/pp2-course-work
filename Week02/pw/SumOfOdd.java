import java.util.Scanner;

public class SumOfOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter two integers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    int start, end;
    if (num1 < num2) {
      start = num1;
      end = num2;
    } else {
      start = num2;
      end = num1;
    }

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }

    System.out.println("Sum of odd numbers between " + num1 + " and " + num2 + " is: " + sum);
  }
}
