import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {

    public static void Histogram(double[] arr, int num) {
        double mean, median, mode = 0;
        double sum = 0;
        int maxCount = 0;


        Arrays.sort(arr);

        if (num % 2 == 0) {
            median = (arr[num/2 - 1] + arr[num/2]) / 2;
        } else {
            median = arr[num/2];
        }

        for(int i = 0; i < num; i++) {
            sum += arr[i];
        }
        mean = sum / num;

        for(int i = 0; i < num; i++){
            int count = 0;
            for(int j = 0; j < num; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
\
        System.out.println("The mean is: " + mean + ", the median is: " + median + ", the mode is: " + mode);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        
        System.out.println();

        double[] arr = new double[num];

        for(int i = 0; i < num; i++){
            if((i+1) % 10 == 1 && (i+1) != 11){ System.out.println("First student's grade is" + (i+1)); } else
            if((i+1) % 10 == 2 && (i+1) != 12){ System.out.println("Second student's grade is" + (i+1)); } else
            if((i+1) % 10 == 3 && (i+1) != 13){ System.out.println("Third student's grade is" + (i+1)); } else
            System.out.println("Student's grade is" + (i+1));
            arr[i] = sc.nextDouble();
        }

        sc.close();

        Histogram(arr, num);

    }

}