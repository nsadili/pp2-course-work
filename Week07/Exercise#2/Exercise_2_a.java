import java.util.Scanner;

public class Exercise_2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println(n + "! = " + factorial);
    }
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}