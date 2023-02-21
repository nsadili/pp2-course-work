package Week04.ex03;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] grades = {9, 6, 8, 7, 9, 10, 8, 7, 7, 6, 8, 9, 8, 6, 7, 10, 10, 8, 8, 7};

        int[] histogram = createHistogram(grades);
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + histogram[i]);
        }

        double mean = calculateMean(grades);
        int median = calculateMedian(grades);
        int mode = calculateMode(grades);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    public static int[] createHistogram(int[] grades) {
        int[] histogram = new int[11];
        for (int i = 0; i < grades.length; i++) {
            histogram[grades[i]]++;
        }
        return histogram;
    }

    public static double calculateMean(int[] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public static int calculateMedian(int[] grades) {
        Arrays.sort(grades);
        int n = grades.length;
        if (n % 2 == 0) {
            return (grades[n/2] + grades[n/2 - 1]) / 2;
        } else {
            return grades[n/2];
        }
    }

    public static int calculateMode(int[] grades) {
        int[] counts = new int[11];
        int maxCount = 0;
        int mode = -1;
        for (int i = 0; i < grades.length; i++) {
            counts[grades[i]]++;
            if (counts[grades[i]] > maxCount) {
                maxCount = counts[grades[i]];
                mode = grades[i];
            }
        }
        return mode;
    }
    

    public static Object[] calculateMeanMedianMode(int[] grades) {
        double mean = calculateMean(grades);
        int median = calculateMedian(grades);
        int mode = calculateMode(grades);
        return new Object[] { mean, median, mode };
    }
}