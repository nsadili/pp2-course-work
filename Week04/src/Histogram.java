import java.util.*;

public class Histogram {
    public static void main(String[] args) {
        int[] grades = { 7, 9, 10, 7, 8, 6, 7, 10, 8, 9, 8, 7, 9, 6, 8, 7, 7, 6, 10 };
        int[] hist = new int[10];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            hist[grade]++;
        }
        System.out.println("Grade histogram:");
        for (int i = 0; i < hist.length; i++) {
            System.out.printf("%2d: ", i);
            for (int j = 0; j < hist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int sum = 0;
        int mode = 0;
        int modeFreq = 0;
        Arrays.sort(grades);
        int currentGrade = grades[0];
        int currentFreq = 0;
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            sum += grade;
            if (grade == currentGrade) {
                currentFreq++;
            } else {
                if (currentFreq > modeFreq) {
                    modeFreq = currentFreq;
                    mode = currentGrade;
                }
                currentGrade = grade;
                currentFreq = 1;
            }
        }
        if (currentFreq > modeFreq) {
            mode = currentGrade;
        }
        double mean = (double) sum / grades.length;
        double median;
        if (grades.length % 2 == 0) {
            median = (double) (grades[grades.length / 2 - 1] + grades[grades.length / 2]) / 2;
        } else {
            median = (double) grades[grades.length / 2];
        }
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}
