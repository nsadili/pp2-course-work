package Week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate the first number: ");
        int a = sc.nextInt();
        System.out.println("Please indicate the second number: ");
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int sum = 0;
        for (int i = a; i <= b;i++) {
            if (i % 2 != 0) sum += i;
        }
        System.out.println("The sum of odd numbers between the given numbers is: " + sum);
    }
}
