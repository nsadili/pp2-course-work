import java.util.Scanner;

public class MinMax {

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int[] result = new int[2];
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int min = findMinimum(arr);
        int max = findMaximum(arr);
        int[] minMax = findMinMax(arr);

        System.out.println("Minimum:  " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum.c: " + minMax[0]);
        System.out.println("Maximum.c: " + minMax[1]);
    }

}
