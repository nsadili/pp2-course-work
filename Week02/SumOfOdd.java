package Week02;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int sum = 0;

            if (num1 > num2) {
                for (int i = num2; i <= num1; i++) {
                    if (i % 2 == 1)
                        sum += i;
                }
                System.out.println(sum);
            } else {
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 1)
                        sum += i;
                }
                System.out.println(sum);
            }
        }
    }

}
