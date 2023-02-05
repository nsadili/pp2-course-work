import java.net.SocketImpl;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.sound.sampled.SourceDataLine;

public class coin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var number = scan.nextInt();

        var copyNumber = number;

        if (number < 0)

            number = -number;

        

        int digit;

        int sum = 0, product = 1, count = 0;

        while (number > 0) {

            digit = number % 10;

            sum += digit;

            product *= digit;

            count++;

            number /= 10;

        }

        var avg = copyNumber != 0

                ? (double) sum / count

                : 0;

        

        product = copyNumber != 0

                ? product

                : 0;

        System.out.printf(

                "Number = %d, Sum = %d, Product = %d, Avg = %.3f\n",

                copyNumber, sum, product, avg);

    }

}
