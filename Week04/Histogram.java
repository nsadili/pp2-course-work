import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int[] histogram = new int[11];
        for(int i=0; i<arr.length; i++) {
            histogram[arr[i]]++;
        }

        for(int i=0; i<histogram.length; i++) {
            System.out.print(i + ": ");
            for(int j=0; j<histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


