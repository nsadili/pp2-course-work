package pp2.week04;

import java.util.Scanner;

import static pp2.week04.GreatestAndSmallestElements.findMax;
import static pp2.week04.GreatestAndSmallestElements.findMin;

public class GreatestAndSmallestElementsWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr_two = new int[length];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            arr_two[i] = scanner.nextInt();
        }

        System.out.println("min = " + findMin(arr_two));
        System.out.println("max = " + findMax(arr_two));
    }
}
