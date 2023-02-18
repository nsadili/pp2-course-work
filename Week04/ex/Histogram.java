import java.util.*;

public class Histogram {
    public static void main(String[] args) {
        int[] grades = {8, 6, 7, 9, 8, 7, 5, 4, 10, 8, 7, 8, 9, 6, 5, 7, 8, 6, 5, 4, 3, 7, 8, 9, 10};

        
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int grade : grades) {
            if (histogram.containsKey(grade)) {
                histogram.put(grade, histogram.get(grade) + 1);
            } else {
                histogram.put(grade, 1);
            }
        }

        
        for (int grade : histogram.keySet()) {
            System.out.printf("Grade %d: %s%n", grade, "*".repeat(histogram.get(grade)));
        }

   
        double mean = Arrays.stream(grades).average().orElse(Double.NaN);
        int median;
        int[] sortedGrades = Arrays.stream(grades).sorted().toArray();
        if (sortedGrades.length % 2 == 0) {
            median = (sortedGrades[sortedGrades.length / 2 - 1] + sortedGrades[sortedGrades.length / 2]) / 2;
        } else {
            median = sortedGrades[sortedGrades.length / 2];
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int grade : grades) {
            countMap.put(grade, countMap.getOrDefault(grade, 0) + 1);
        }
        int mode = Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Median: %d%n", median);
        System.out.printf("Mode: %d%n", mode);
    }
}
 