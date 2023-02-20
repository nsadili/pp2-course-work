package pp2.week04;

import java.util.Arrays;

public class Histogram {

    public static void main(String[] args) {
        int[] grades = {8, 9, 7, 6, 8, 10, 9, 7, 8, 8, 7, 6, 9, 9, 8, 7, 8, 10, 10, 8};

        // Create a histogram of grades
        int[] histogram = new int[11];
        for (int grade : grades) {
            histogram[grade]++;
        }

        // Print the histogram
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + "*".repeat(histogram[i]));
        }

        // Calculate the mean, median, and mode
        double mean = calculateMean(grades);
        double median = calculateMedian(grades);

        // Print the results
        System.out.printf("Mean grade: %.2f%n", mean);
        System.out.printf("Median grade: %.2f%n", median);
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
}