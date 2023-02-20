import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error");
            return;
        }
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int min = calculateMin(arr);
        int max = calculateMax(arr);
        System.out.println("Please use command lines");
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        System.out.println(max);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please give me the size");
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i+1));
            arr2[i] = sc.nextInt();
        }
        int[] minMax = calculateMinMax(arr2);
        System.out.println("\nUsing Scanner object:");
        System.out.println(Arrays.toString(arr2));
        System.out.println(minMax[0]);
        System.out.println(minMax[1]);
    }

    public static int calculateMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int calculateMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] MinMax(int[] arr) {
        int[] min_max = new int[2];
        minMax[0] = arr[0];
        minMax[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min_max[0]) {
                min_max[0] = arr[i];
            }
            if (arr[i] > min_max[1]) {
                min_max[1] = arr[i];
            }
        }
        return min_max;
    }
}
