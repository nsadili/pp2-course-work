package Week04.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students:");
        int length = scanner.nextInt();

        int[] students = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            int validnumber = scanner.nextInt();
            if (validnumber >= 0 && validnumber <= 10) {
                students[i] = validnumber;
            } else {
                students[i] = 0;
            }
        }

        System.out.println();
        System.out.println(mean(students));
        System.out.println(median(students));
        System.out.println(mode(students));
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    private static String mean(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return "Mean of class grade : " + sum / arr.length;
    }

    private static String median(int arr[]) {
        double median;
        int oddmedian = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
        if (arr.length % 2 == 0) {
            return "Median of class grade :" + (arr[oddmedian] + arr[oddmedian - 1]) / 2.0;
        } else {
            return "Median of class grade :" + arr[oddmedian];
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    private static String mode(int arr[]) {
        int modecount = 0;
        int mode = 0, z = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    modecount++;
                    z = arr[i];

                }
                if (modecount > 0) {
                    mode = z;
                } else {
                    System.out.println("There is no any mode");
                }

            }
        }
        return "Mode of class : " + mode;
    }


}



