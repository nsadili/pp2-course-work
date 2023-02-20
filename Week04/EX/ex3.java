package EX;
import java.util.Scanner;
import java.util.Arrays;

class GradeInfo{
    double mean;
    double median;
    int mode;
    public GradeInfo(double mean, double median, int mode){
        this.setMean(mean);
        this.setMedian(median);
        this.setMode(mode);
    }
    public void setMean(double mean) {
        this.mean = mean;
    }
    public void setMedian(double median) {
        this.median = median;
    }
    public void setMode(int mode) {
        this.mode = mode;
    }
    
}

public class ex3 {
    public static void main(String[] args) {
        int[] grades = scanArray();
        GradeInfo histogram = new GradeInfo(getMean(grades), getMedian(grades), getMode(grades));
        System.out.printf("\nHistogram Information\nMean: %.2f\nMedian: %.2f\nMode: %d\n\n", histogram.mean, histogram.median, histogram.mode);
    }

    // methods
    public static int[] scanArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int n = scan.nextInt();
        int grades[] = new int[n];
        for (int i = 0; i < grades.length; i++){
            System.out.print("Enter the number " + (i + 1) + ": ");
            grades[i] = scan.nextInt();
        }
        scan.close();
        return grades;
    }
    
    public static double getMedian(int[] arr){
        Arrays.sort(arr);
        int middle = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (double) (arr[middle - 1] + arr[middle]) / 2;
        } else {
            return arr[middle];
        }
    }

    public static double getMean(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / (double) arr.length;
    }

    public static int getMode(int[] arr){
        int count = 0;
        int maxCount = 0;
        int mode = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++){
            if (arr[i - 1] == arr[i]) {
                count++;
                if (count > maxCount) mode = arr[i];
            }
            else count = 1;
        }
        return mode == 0 ? arr[0] : mode;
    }

    public static GradeInfo getInfo(int[] arr){
        return new GradeInfo(getMean(arr), getMedian(arr), getMode(arr));
    }
}