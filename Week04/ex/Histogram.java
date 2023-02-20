import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Histogram {
  public static void main(String[] args) {
    int[] grades = {7, 8, 9, 10, 6, 7, 8, 8, 7, 6, 5, 4, 6, 7, 8, 9, 9, 9, 10, 10};
    int[] histogram = new int[11];
  
    for(int grade : grades) {
      histogram[grade]++;
    }
  
    for (int i = 0; i < histogram.length; i++) {
      System.out.println(i + ":" + histogram[i]);
    }
  
    System.out.println("Mean:" + mean(grades));
    System.out.println("Median:" + median(grades));
    System.out.println("Mode:" + mode(grades));
  }
  
  public static double mean(int[] grades) {
    double sum = 0;
    for(int grade : grades) {
        sum += grade;
    }
    return sum / grades.length;
  }
  
  public static double median(int[] grades) {
    Arrays.sort(grades);
    int middle = grades.length / 2;
    if (grades.length % 2 == 0) {
        return (grades[middle - 1] + grades[middle]) / 2.0;
    } else {
        return grades[middle];
    }
  }
  
  public static int mode(int[] grades) {
    Map<Integer, Integer> frequencies = new HashMap<>();
    int mode = -1;
    int maxFrequency = 0;
    for (int grade : grades) {
        int frequency = frequencies.getOrDefault(grade, 0) + 1;
        frequencies.put(grade, frequency);
        if (frequency > maxFrequency) {
            maxFrequency = frequency;
            mode = grade;
        }
    }
    return mode;
  }
}
   
