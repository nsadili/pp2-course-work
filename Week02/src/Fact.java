package Week02.src;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        if (n < 0) {
            System.out.println("Error");
            return;
        } else if (n == 0) {
            System.out.println(1);
            return;
        } else {
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}
