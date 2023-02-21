import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        int[] grades = {8, 7, 6, 7, 10, 8, 9, 10, 9, 7, 8, 9, 10, 6, 7};

        int[] histogram = new int[11];
        for (int i = 0; i < grades.length; i++) {
            histogram[grades[i]]++;
        }

    
        for (int i = 0; i < histogram.length; i++) {
            System.out.println("Grade " + i + ": " + histogram[i]);
        }

       
        double mean = calculateMean(grades);
        double median = calculateMedian(grades);
        int mode = calculateMode(grades);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int middle = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (arr[middle-1] + arr[middle]) / 2.0;
        } else {
            return arr[middle];
        }
    }


    public static int calculateMode(int[] arr) {
        int mode = arr[0];
        int maxCount = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        return mode;
    }
}
