import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // grades
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d : ", i + 1);
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }

    static double mean(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double mean = sum / n;
        return mean;
    }

    static int median(int[] arr, int n){
            if (n%2==1) return arr[n/2+1];
            else return ((arr[n/2]+ arr[n/2 +1])/2);
        }

static int moda(int[] arr, int n ){

}
    }
