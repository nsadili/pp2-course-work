import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        return sum / array.length;
    }

    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }    

    public static int mostRepeatedElement(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int mostRepeatedElement = 0;
        int maxCount = 0;
        for (int num : arr) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                mostRepeatedElement = num;
            }
        }
        return mostRepeatedElement;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find average
        //System.out.println(calculateAverage(arr));

        // Reverse 
        //reverse(arr);
        //System.out.println(Arrays.toString(arr));

        // Sort
        //quickSort(arr, size, size);
        //System.out.println(Arrays.toString(arr));

        // Most Repeated
        //System.out.println(mostRepeatedElement(arr));
    }
}
