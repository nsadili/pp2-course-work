package ex;

public class HistogramTest {
    public static void main(String[] args){
        int[] grades = { 7, 8, 6, 9, 5, 7, 8, 8, 7, 10 };
int[] histogram = Histogram.createHistogram(grades);
double[] statistics = Histogram.calculateStatistics(grades);

System.out.println("Histogram:");

for (int i = 0; i < histogram.length; i++) {
    System.out.printf("%d: %d%n", i, histogram[i]);
}

System.out.printf("Mean: %.2f%n", statistics[0]);
System.out.printf("Median: %.2f%n", statistics[1]);
System.out.printf("Mode: %d%n", (int) statistics[2]);

    }
}
