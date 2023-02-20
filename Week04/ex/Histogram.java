import java.util.*;

public class GradesStatistics {

    public static void main(String[] args) {
        int[] grades = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] histogram = new int[10];
        for (int grade : grades) {
            histogram[grade]++;
        }

        System.out.println("Histogram:");
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + histogram[i]);
        }

        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double mean = sum / grades.length;
        System.out.println(mean);

        Arrays.sort(grades);
        int middle = grades.length / 2;
        double median;
        if (grades.length % 2 == 1) {
            median = grades[middle];
        } else

        {
            median = (grades[middle - 1] + grades[middle]) / 2.0;
        }
        System.out.println(median);

        int mode = -1;
        int max_count = 0;
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > max_count) {
                max_count = histogram[i];
                mode = i;
            }
        }
        System.out.println(mode);
    }
}