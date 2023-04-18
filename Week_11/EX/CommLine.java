package Week04.EX;
import java.util.Scanner;

public class CommLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your numbers separated by spaces: ");
    String input = scanner.nextLine();
    String[] numberStrings = input.split(" ");
    int[] numbers = new int[numberStrings.length];
    for (int i = 0; i < numberStrings.length; i++) {
      numbers[i] = Integer.parseInt(numberStrings[i]);
    }
    printArray(numbers);
    int sum = calculateSum(numbers);
    double average = (double) sum / numbers.length;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    scanner.close();
  }

  public static void printArray(int[] arr) {
    System.out.print("Array: [");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static int calculateSum(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    return sum;
  }

}
