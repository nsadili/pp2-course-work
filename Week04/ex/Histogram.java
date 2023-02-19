package Week04.ex;
import java.util.Arrays;

public class Histogram {
public static void main(String[] args) {
int[] grades = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
int[] gradeCounts = new int[11];
for (int grade : grades) {
gradeCounts[grade]++;
}
System.out.println("Histogram of Class Grades:");
for (int i = 0; i < gradeCounts.length; i++) {
System.out.print(i + ": ");
for (int j = 0; j < gradeCounts[i]; j++) {
System.out.print("*");
}
System.out.println();
}
System.out.println();
double mean = calculateMean(grades);
double median = calculateMedian(grades);
int mode = calculateMode(grades);
System.out.println("Mean: " + mean);
System.out.println("Median: " + median);
System.out.println("Mode: " + mode);
}
public static double calculateMean(int[] array) {
    double sum = 0;
    for (int element : array) {
        sum += element;
    }
    return sum / array.length;
}

public static double calculateMedian(int[] array) {
    Arrays.sort(array);
    if (array.length % 2 == 0) {
        int index1 = array.length / 2 - 1;
        int index2 = array.length / 2;
        return (array[index1] + array[index2]) / 2.0;
    } else {
        int index = array.length / 2;
        return array[index];
    }
}

public static int calculateMode(int[] array) {
    int mode = array[0];
    int maxCount = 0;
    for (int i = 0; i < array.length; i++) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == array[i]) {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            mode = array[i];
        }
    }
    return mode;
}
}