package ex;

import java.util.*;

public class Histogram {

    public static int[] createHistogram(int[] grades) {
        int[] histogram = new int[11];
        for (int grade : grades) {
            histogram[grade]++;
        }
        return histogram;
    }

    public static double calculateMean(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static double calculateMedian(int[] grades) {
        Arrays.sort(grades);
        int middle = grades.length / 2;
        if (grades.length % 2 == 0) {
            return (grades[middle - 1] + grades[middle]) / 2.0;
        } else {
            return grades[middle];
        }
    }

    public static int calculateMode(int[] grades) {
        int maxCount = 0;
        int mode = -1;
        int[] histogram = createHistogram(grades);
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > maxCount) {
                maxCount = histogram[i];
                mode = i;
            }
        }
        return mode;
    }

    public static double[] calculateStatistics(int[] grades) {
        double[] statistics = new double[3];
        statistics[0] = calculateMean(grades);
        statistics[1] = calculateMedian(grades);
        statistics[2] = calculateMode(grades);
        return statistics;
    }
}
