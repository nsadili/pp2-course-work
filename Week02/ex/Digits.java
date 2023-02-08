import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, prod = 1;
        n = n > 0 ? n : -n;
        if (n == 0) {
            System.out.println("Sum: 0\nProduct: 0\nAverage: 0");
            return;
        }
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
            prod *= i % 10;
        }
        System.out.printf("Sum: %d\nProduct: %d\nAverage: %.5f\n", sum, prod, (double)sum / Integer.toString(n).length());
    }
}
