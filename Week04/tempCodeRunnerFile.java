import java.util.Arrays;

public class Histogram {
  public static void main(String[] args) {

    int[] grades = {9, 8, 7, 5, 6, 5, 10, 8, 9, 9, 7, 6, 8, 10, 0};

    int[] histogram = calculateHistogram(grades);

    printHistogram(histogram);

    double mean = calculateMean(grades);
    double median = calculateMedian(grades);
    int mode = calculateMode(grades);
    System.out.println("Mean: " + mean);
    System.out.println("Median: " + median);
    System.out.println("Mode: " + mode);
  }

  public static int[] calculateHistogram(int[] arr) {
    int[] histogram = new int[11];
    for (int i = 0; i < arr.length; i++) {
      histogram[arr[i]]++;
    }
    return histogram;
  }

  public static void printHistogram(int[] arr) {
    System.out.println("Histogram:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(i + ": ");
      for (int j = 0; j < arr[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static double calculateMean(int[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum / arr.length;
  }

  public static double calculateMedian(int[] arr) {
    Arrays.sort(arr);
    if (arr.length % 2 == 0) {
      return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
    } else {
      return arr[arr.length / 2];
    }
  }
d
  public static int calculateMode(int[] arr) {
    int mode = arr[0];
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] == arr[i]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        mode = arr[i];
      }
    }
    return mode;
  }
}
