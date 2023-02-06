package Week02;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the number: ");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0 || number == 1) System.out.println("The number is not prime");
        else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 1) System.out.println("The given number is not prime");
            else System.out.println("The given number is prime");
        }
    }
}
