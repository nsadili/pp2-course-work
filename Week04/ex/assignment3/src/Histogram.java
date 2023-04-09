import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {

        int[] grades = { 4, 8, 6, 10, 5, 9, 8, 3, 0, 7, 6, 3, 5, 9, 6 };

        int[] histogram = createHistogram(grades);
        System.out.println("Histogram of the class grades:");
        for (int i = 0; i < histogram.length; i++) {
            System.out.println("Grade " + i + ": " + histogram[i]);
        }

        double mean = getMean(grades);
        int median = getMedian(grades);
        int mode = getMode(grades);
        System.out.println("Mean of the class grades: " + mean);
        System.out.println("Median of the class grades: " + median);
        System.out.println("Mode of the class grades:" + mode);
    }

    public static int[] createHistogram(int[] grades) {
        int[] histogram = new int[11];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            histogram[grade]++;
        }
        return histogram;
    }

    public static double[] getMeanMedianMode(int[] grades) {
        double mean = getMean(grades);
        int median = getMedian(grades);
        int mode = getMode(grades);
        double[] mmM = { mean, median, mode };
        return mmM;
    }

    public static double getMean(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double mean = sum / grades.length;
        return mean;
    }

    public static int getMedian(int[] grades) {
        Arrays.sort(grades);
        int mid = (grades.length - 1) / 2;
        if (grades.length % 2 == 0) {
            return (grades[mid] + grades[mid + 1]) / 2;
        } else {
            return grades[mid];
        }
    }

    public static int getMode(int[] grades) {
        int maxCount = 0;
        int mode = 0;
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