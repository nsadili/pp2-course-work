package EX;
import java.util.Scanner;
import java.util.Arrays;

class GradeInfo{
    int mean;
    int median;
    int mode;
    public GradeInfo(int mean, int median, int mode){
        this.setMean(mean);
        this.setMedian(median);
        this.setMode(mode);
    }
    public void setMean(int mean) {
        this.mean = mean;
    }
    public void setMedian(int median) {
        this.median = median;
    }
    public void setMode(int mode) {
        this.mode = mode;
    }
    
}

    // main
public class histogram {
    public static void main(String[] args) {
        int[] grades = scanArray();
    }

    // methods
    public static int[] scanArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of grades: ");
        int n = scan.nextInt();
        int grades[] = new int[n];
        for (int i = 0; i < grades.length; i++){
            grades[i] = scan.nextInt();
        }
        scan.close();
        return grades;
    }
    
    public static int getMedian(int[] arr){
        Arrays.sort(arr);
        int middle = (arr.length + 1) / 2;
        return arr[middle];
    }

    public static int getMean(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int getMode(int[] arr){
        Arrays.sort(arr);
        
    }

    public static GradeInfo getInfo(int[] arr){
        return new GradeInfo(getMean(arr), getMedian(arr), getMode(arr));
    }

    public static void printHistogram(int[] arr){
        for (int i = 0; i < arr.length; i++){

        }
    }
}