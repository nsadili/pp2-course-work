package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 9, 9, 5, 4, 3, 3, 4, 5, 6, 3, 1, 3, 5, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The most frequent element in the array is: " + mostFrequentElement(array));
    }
    public static int mostFrequentElement(int[] array) {
        int max = 0;
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) count++;
            }
            if (count > max) {
                max = count;
                element = array[i];
            }
        }
        return element;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
