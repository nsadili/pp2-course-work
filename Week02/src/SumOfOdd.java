import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            count++;
            num /= 10;
        }
        System.out.println(sum);
        System.out.println(product);
        System.out.println((1.0 * sum) / count);
    }
}
