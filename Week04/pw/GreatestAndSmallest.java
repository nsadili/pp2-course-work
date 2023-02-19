package Week04.pw;

import java.util.Scanner;

public class GreatestAndSmallest {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter how many elements you want to input: ");
            int n = scan.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            int min = array[0];
            int max = array[0];
            for (int j: array) {
                if (j < min) min = j;
                if (j > max) max = j;
            }
            System.out.println("Max is: "+max);
            System.out.println("Min is: "+min);
        }
    }
}
