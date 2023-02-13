import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

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
        double average = (double) sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }
}
