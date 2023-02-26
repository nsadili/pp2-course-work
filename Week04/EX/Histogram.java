import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        int[] grades = {7, 5, 8, 8, 9, 7, 10, 6, 8, 7, 9, 7, 6, 5, 8, 7, 10, 9, 9, 8};
        int[] histogram = new int[11]; 
        for (int i = 0; i < grades.length; i++) {
            histogram[grades[i]]++;
        }
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + repeat("*", histogram[i]));
        }
    }
    
    public static String repeat(String str, int n) {
        return new String(new char[n]).replace("\0", str);
    }
}
