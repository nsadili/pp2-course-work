public class Histogram{

    public static void printHistogram(int[] grades) {
        int[] frequency = new int[11]; // grades are in range [0-10]
        for (int i = 0; i < grades.length; i++) {
            frequency[grades[i]]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + ": " + frequency[i]);
        }
    }

    int[] grades = {5, 7, 8, 4, 5, 9, 6, 7, 8, 8, 3, 2, 5, 6, 7, 7, 9, 9, 9, 10};
int[] histogram = new int[11]; // initialize array with zeros
for (int grade : grades) {
    histogram[grade]++;
}
for (int i = 0; i <= 10; i++) {
    System.out.printf("%2d: %d%n", i, histogram[i]);
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GradeAnalyzer {
    public static void main(String[] args) {
        int[] grades = {5, 7, 8, 4, 5, 9, 6, 7, 8, 8, 3, 2, 5, 6, 7, 7, 9, 9, 9, 10};
        double mean = calculateMean(grades);
        int median = calculateMedian(grades);
        int mode = calculateMode(grades);
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Median: %d%n", median);
        System.out.printf("Mode: %d%n", mode);
    }

    public static double calculateMean(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int calculateMedian(int[] grades) {
        Arrays.sort(grades);
        int middle = grades.length / 2;
        if (grades.length % 2 == 0) {
            return (grades[middle - 1] + grades[middle]) / 2;
        } else {
            return grades[middle];
        }
    }

    public static int calculateMode(int[] grades) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int mode = grades[0];
        int maxFrequency = 1;
        for (int grade : grades) {
            int frequency = frequencies.getOrDefault(grade, 0) + 1;
            frequencies.put(grade, frequency);
            if (frequency > maxFrequency) {
                mode = grade;
                maxFrequency = frequency;
            }
        }
        return mode;
    }
}

    
}