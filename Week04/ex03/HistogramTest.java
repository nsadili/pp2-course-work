package Week04.ex03;

import java.util.Arrays;
import java.util.Scanner;
class histogram{
    private int[] sortedArray;
    public double mean;
    public int mode;
    public double meadian;
    public histogram(int[] arr) {
        sortedArray = new int[arr.length];     
        for (int i = 0; i < arr.length; i++)
            sortedArray[i] = arr[i]; 
        mean = findMean(sortedArray);
        meadian = findMedian(sortedArray);
        mode = findMode(sortedArray);
    }
    private static double findMedian(int[] arr){
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (double) (arr[mid - 1] + arr[mid]) / 2;
        } 
        else {
            return arr[mid];
        }
    }
    private static double findMean(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
    private static int findMode(int[] arr){
        int currentMode = arr[0];
        int currentCount = 1;
        int mode = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > count) {
                    mode = currentMode;
                    count = currentCount;
                }
                currentMode = arr[i];
                currentCount = 1;
            }
        }
        if (currentCount > count) {
            mode = currentMode;
            count = currentCount;
        }
        return mode;
    }
}
public class HistogramTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt(); 
        int[] numbers = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); 
        }
        scanner.close();
        histogram histogram = new histogram(numbers);
        System.out.print("Array elements: " + Arrays.toString(numbers) + "\nMean: " + histogram.mean +"\nMedian: "+ histogram.meadian +"\nMode: "+ histogram.mode+"\n" );
    }
    
}
