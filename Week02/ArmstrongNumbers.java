import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Check if a single number is Armstrong
            System.out.print("Enter a positive integer: ");
            int num = sc.nextInt();
            int sum = 0;
            int originalNum = num;
            int numDigits = String.valueOf(num).length();

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, numDigits);
                num /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number");
            } else {
                System.out.println(originalNum + " is not an Armstrong number");
            }

            // Print all Armstrong numbers within a range
            System.out.print("Enter two positive integers to find Armstrong numbers within the range: ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int i = start; i <= end; i++) {
                int temp = i;
                sum = 0;

                while (temp > 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, numDigits);
                    temp /= 10;
                }

                if (sum == i) {
                    System.out.println(i + " is an Armstrong number");
                }
            }
        }
    }
}
