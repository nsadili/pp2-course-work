import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter how many grades there will be: ");
    int n = scan.nextInt();

    int[] grades = new int[n];
    int[] histogram = new int[11];

    System.out.println("Please enter " + n + " grades from 0 to 10:");
    for (int j = 0; j < grades.length; j++) {
      grades[j] = scan.nextInt();
    }

    System.out.println("");
    System.out.println("Output:");

    for (int i = 0; i < grades.length; i++) {
      int grade = grades[i];
      histogram[grade]++;
    }

    for (int i = 0; i < histogram.length; i++) {
      System.out.println(i + ": " + histogram[i]);
    }

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
    int middle = grades.length / 2;
    if (grades.length % 2 == 0) {
      return (grades[middle - 1] + grades[middle]) / 2;
    } else {
      return grades[middle];
    }
  }

  public static int calculateMode(int[] grades) {
    int mode = grades[0];
    int maxCount = 0;
    for (int i = 0; i < grades.length; i++) {
      int count = 0;
      for (int j = 0; j < grades.length; j++) {
        if (grades[j] == grades[i]) {
          count++;
        }
      }
      if (count > maxCount) {
        mode = grades[i];
        maxCount = count;
      }
    }
    return mode;
  }
}