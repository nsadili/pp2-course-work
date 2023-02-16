package Week04;
import java.util.Scanner;
public class NewClassEx {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("write the size :? ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            int sum = 0;
            double average;
            System.out.print("write the elements:| ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            average = (double) sum / size;
            System.out.println("well, the average of the arr is :) " + average);

        }
    }

