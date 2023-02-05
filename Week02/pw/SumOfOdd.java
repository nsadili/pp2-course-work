public class SumOfOdd {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Please enter two numbers");
      System.exit(0);
    }
    var num1 = Integer.parseInt(args[0]);
    var num2 = Integer.parseInt(args[1]);
    int min = Math.min(num1, num2);
    int max = Math.max(num1, num2);
    int sum = 0;
    for (int i = min; i <= max; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    System.out.println("Sum of odd numbers: " + sum);
  }
}
