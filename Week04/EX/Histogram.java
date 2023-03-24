import java.util.Arrays;

public class Histogram {
    
    public static void printHistogram(int[] grades) {
        int[] hist = new int[11];

        for (int grade : grades) {
            hist[grade]++;
        }

        for (int i = 0; i < hist.length; i++) {
            System.out.println(i + ": " + hist[i]);
        }
    }

    public static double calculateMean(int[] grades) {
        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
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
        int mode = -1;
        int maxCount = 0;

        for (int i = 0; i < grades.length; i++) {
            int count = 0;

            for (int j = 0; j < grades.length; j++) {
                if (grades[i] == grades[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = grades[i];
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] grades = {9, 10, 8, 7, 8, 9, 10, 7, 6, 8, 9, 9, 10, 10, 8};

        System.out.println("Histogram of quiz grades:");
        printHistogram(grades);

        double mean = calculateMean(grades);
        System.out.println("Mean: " + mean);

        double median = calculateMedian(grades);
        System.out.println("Median: " + median);

        int mode = calculateMode(grades);
        System.out.println("Mode: " + mode);
    }
}
