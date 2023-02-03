import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var number = input.nextInt();
        if (number <= 0)
            number = Math.abs(number);

        int digit;

        var sum = 0;

        var product = 1;
        var count = 0;

        while (number > 0) {

            digit = number % 10;

            sum += digit;
            product *= digit;
            count++;
            number /= 10;

        }

        var avg = (double) sum / count;

        System.out.printf(

                "Number = %d, Sum = %d, Product = %d, Avg = %.3f\n", number, sum, product, avg);

    }

}

