package Week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int sum = 0;
        for (int c = a; c <= b;c++) {
            if (c % 2 != 0) sum += c;
        }
        System.out.println("The sum of odd numbers between the given numbers is: " + sum);
    }
}