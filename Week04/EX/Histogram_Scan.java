

import java.util.Arrays;
import java.util.Scanner;

public class Histogram_Scan{
            public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade[] = new int[100000];
        int i = 0;

        while (scan.hasNextInt()) {
            grade[i++] = scan.nextInt();
        }

        for (int k = 0; k < i; k++) {
            System.out.printf("Student %d ", k + 1);
            for (int l = 0; l < grade[k]; l++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        System.out.println("Mean -> " + Mean(grade, i));
        System.out.println("Median -> " + Median(grade, i));
    }

    public static double Mean(int[] grades, int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += grades[j];
        }
        double res = (double) sum / n;
        return res;
    }

    public static double Median(int[] grades, int n) {
        Arrays.sort(grades, 0, n);
        if (n % 2 == 1) {
            return grades[n/2];
        } else {
            return (grades[n/2 - 1] + grades[n/2]) / 2.0;
        }
    }
}
