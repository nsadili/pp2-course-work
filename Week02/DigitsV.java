import java.util.Scanner;

public class DigitsV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int product = 1;
        double average = 0;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            count++;
            num = num / 10;
        }
        average = (double) sum / count;
        System.out.println("Sum of digits is " + sum);
        System.out.println("Product of digits is " + product);
        System.out.println("Average of digits is " + average);
    }
}
