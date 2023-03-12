package Week07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner.sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorialCalculator(number));
        sc.close();
    }
}
