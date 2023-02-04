import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var number = scan.nextInt();
        var temp = number;
        if (number < 0) {
            number = -number;
        }
        // number = Math.abs(number);
        int digit;
        var sum = 0;
        var product = 1;
        var cnt = 1;
        while (number > 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            cnt++;
            number /= 10;
        }
        var avg = (double) sum / cnt;
        System.out.printf("Number=%d, Sum=%d, Product=%d, Average=%.3f",
                temp, sum, product, avg);
    }
}
