package Week02;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give nth elements number?: ");
        int n = sc.nextInt();
        double nth = 0;
        for (int i = 1; i <= n; i++) {
            nth += 1.0 / i;
        }
        System.out.println("The nth element of harmonic series is: " + nth);
    }
}
