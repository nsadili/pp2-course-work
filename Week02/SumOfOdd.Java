public class SumOfOdd {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers between " + start + " and " + end + " is " + sum);
    }
}
