package Week02;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[999];
        int i = 0;
        double avg = 0;
        System.out.println("Add the numbers: ");
        do {
            num[i++] = sc.nextDouble();
        } while(sc.hasNextDouble());
        if (num[0] == 0)
            System.out.println("No input has been inserted!");
        else {
            for (int j = 0; j < i; j++) {
                avg += (num[j] / i);
            }
            System.out.println("The average is: " + avg);
        }
    }
}
