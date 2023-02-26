import java.util.Arrays;

public class HistogramStats {
    public static void main(String[] args) {
        int[] grades = {7, 5, 8, 8, 9, 7, 10, 6, 8, 7, 9, 7, 6, 5, 8, 7, 10, 9, 9, 8};
        double mean = calculateMean(grades);
        int median = calculateMedian(grades);
        int mode = calculateMode(grades);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
    
    public static double calculateMean(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }
    
    public static int calculateMedian(int[] grades) {
        Arrays.sort(grades);
        if (grades.length % 2 == 0) {
            int midIndex1 = grades.length / 2 - 1;
            int midIndex2 = grades.length / 2;
            return (grades[midIndex1] + grades[midIndex2]) / 2;
        } else {
            int midIndex = grades.length / 2;
            return grades[midIndex];
        }
    }
    
    public static int calculateMode(int[] grades) {
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < grades.length; i++) {
            int count = 0;
            for (int j = 0; j < grades.length; j++) {
                if (grades[j] == grades[i]) {
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
}
