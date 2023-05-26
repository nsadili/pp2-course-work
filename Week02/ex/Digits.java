import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            var num = scan.nextInt();
            var temp = num;
            if (num < 0)
                num = -num;
            // number = Math

            int dig;
            var sum = 0;
            var product = 1;
            var count = 0;

            while (num > 0) {
                dig = num % 10;
                sum += dig;
                product *= dig;
                count++;
                num /= 10;
            }
            var avg = temp != 0
                    ? (double) sum / count
                    : 0;
            if (temp == 0)
                product = 0;

            System.out.printf("Number=%d, sum=%d, product=%d, avarage=%.3f", temp, sum, product, avg);
        }

    }
}