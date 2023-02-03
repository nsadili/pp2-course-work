import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = Math.abs(sc.nextInt());

        //int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        int copy = num;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
            count++;
        }

        System.out.println("Sum of the digits of " + copy +" equals: " + sum);
        System.out.println("product of the digits " + copy +" equals: " + product);
        System.out.println("Average of the digits " + copy +" equals: " + (double) sum / count);
    }
}
