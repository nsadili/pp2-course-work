package Week02;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[999];
        int a = 0;
        double avg = 0;
        System.out.println("Add the numbers: ");
        do {
            num[a++] = sc.nextDouble();
        } while(sc.hasNextDouble());
            for (int b = 0; b < a; b++) {
                avg += (num[b] / a);
            }
            System.out.println("The average is: " + avg);

    }
}