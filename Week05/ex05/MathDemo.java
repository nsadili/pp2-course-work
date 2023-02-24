import java.util.Scanner;

class Clac{ 
    public int min(int a, int b) {
        return (a < b) ? a : b;
    }
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }
}
public class MathDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clac calculator = new Clac();

        System.out.print("Please, enter the first input: ");
        int num1 = sc.nextInt();
        System.out.print("Please, enter the second input: ");
        int num2 = sc.nextInt();

        System.out.println("Minimum: " + calculator.min(num1, num2));
        System.out.println("Maximum: " + calculator.max(num1, num2));

        System.out.print("Please, enter the length of the array: ");
        int length = sc.nextInt();
        int[] inputArray = new int[length];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            inputArray[i] = sc.nextInt();
        }
        System.out.println("Mean: " + calculator.mean(inputArray));
        System.out.println("Sum: " + calculator.sum(inputArray));

        System.out.print("Please, enter an input: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial: " + calculator.factorial(num));
    }
}
