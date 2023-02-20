import java.util.Scanner;
import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // number of students
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d : ", i + 1);
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        double mean = mean(arr, n);
        int median = median(arr, n);
        int moda = moda(arr, n);
        double[] meanMedModa = meanMedModa (arr , n);


        System.out.println("mean " + mean);
        System.out.println("median " + median);
        System.out.println("moda " + moda);
        System.out.println("Mean, median, moda "+ mean +", "+ median+", "+moda);

    }

    static double mean(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double mean = sum / n;
        return mean;
    }

    static int median(int[] arr, int n) {
        Arrays.sort(arr);
        int median;
        if (n % 2 == 1)
            return arr[n / 2];
        else
            return ((arr[n / 2] + arr[n / 2 - 1]) / 2);
    }

    static int moda(int[] arr, int n) {
        int moda = 0;
        int maxcnt = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    cnt++;
            }
            if (cnt > maxcnt) {
                maxcnt = cnt;
                moda = arr[i];
            }
        }
        return moda;
    }

    static double[] meanMedModa(int[] arr, int n) {
        double[] values = new double[3];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double mean = sum / n;
        values[0] = mean;

        Arrays.sort(arr);
        int median;
        if (n % 2 == 1)
            median = arr[n / 2];
        else
            median = ((arr[n / 2] + arr[n / 2 - 1]) / 2);

        values[1] = median;
        int moda = 0;
        int maxcnt = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    cnt++;
            }
            if (cnt > maxcnt) {
                maxcnt = cnt;
                moda = arr[i];
            }
        }
        values[2] = moda;
        return values;

    }

}
