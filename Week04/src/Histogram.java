import java.util.*;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents = sc.nextInt();

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            grades[i] = sc.nextInt();
        }

        int[] histogram = new int[11]; 

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            histogram[grade]++;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%2d: ", i);
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        double mean = calculateMean(grades);
        int median = calculateMedian(grades);
        int mode = calculateMode(grades);

        
        System.out.printf("Mean: %.2f\n", mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);

    }

    public static double calculateMean(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int calculateMedian(int[] grades) {
        int[] sortedGrades = grades.clone();
        Arrays.sort(sortedGrades);
        int middle = sortedGrades.length / 2;
        if (sortedGrades.length % 2 == 0) {
            return (sortedGrades[middle - 1] + sortedGrades[middle]) / 2;
        } else {
            return sortedGrades[middle];
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
