import java.util.Arrays;

public class Histogram {

    public static void meanModeMedian(int arr []) {
        double sum = 0;
        int max=-10000;
        int maxId = 0;
        double median = 0;
        int [] amount = new int[11];
        for(int i: arr) {
            sum+= i;
        }
        double mean = sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            int grade = arr[i];
            amount[grade]++;
        }
        for(int i = 0; i < amount.length; i++) {
            if(amount[i]>max) { 
                max = amount[i];
                maxId = i;
            }
        }
        int mode = maxId;
        Arrays.sort(arr);
        if(arr.length%2 == 0) {
            median = (arr[arr.length/2] + arr[arr.length/2 +1])/2.0;
        } else {
            median = arr[arr.length/2 +1];
        }
        System.out.println("Mean: "+mean+", Mode: "+mode+", Median: "+median);
    }
    public static void main(String[] args) {
        int[] grades = {3, 7, 5, 8, 9, 6, 7, 4, 8, 0, 10, 9, 6, 5, 8, 7, 6, 4, 5, 6, 3};
        int[] tempGrades = Arrays.copyOf(grades, grades.length);
        int[] histogram = new int[11];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            histogram[grade]++;
        }
        for (int i = 0; i < histogram.length; i++) {
            System.out.print(i+": "); 
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        meanModeMedian(tempGrades);
    }
}
