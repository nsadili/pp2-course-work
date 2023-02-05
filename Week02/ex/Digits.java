import java.util.Scanner;

public class Digits {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        var number = scan.nextInt();
        var copynumber = number;

        if (number < 0 )
        number = -number;

        int digit, sum = 0, count = 0, product = 1;

        while (number > 0) {
            digit = number % 10;

            sum += digit;
            count++;
            product *= digit;
            number /= 10;
        }

        var avg =  copynumber !=0 
        ? (double) sum / count
        : 0.0;

        product = copynumber != 0
        ? product 
        : 0;


        System.out.printf("Number = %d, Sum = %d, Product = %d, Avg = %f\n", copynumber, sum, product, avg);

    }
}
