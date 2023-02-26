package practicalwork;

import java.util.Arrays;
import java.util.Scanner;

public class DigitsThatMostRepeated {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[10];

		int n = 239587436;

		while (n > 0) {
			arr[n % 10] += 1;
			n /= 10;
		}

		System.out.println(Arrays.toString(arr));
		int maximum = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maximum) {
				maximum = arr[i];
			}
		}
		System.out.println(maximum);
		System.out.println(indexOf(arr, maximum));

		int[] newArr = { 1, 44, 55, 12, 45, 66 };

		for (int i = 0; i < newArr.length; i++) {
			for (int j = i + 1; j < newArr.length; j++) {
				if (newArr[i] > newArr[j]) {
					int temporary = newArr[i];
					newArr[i] = newArr[j];
					temporary = newArr[j];
				}
			}
		}
		System.out.println(Arrays.toString(newArr));
		
		int[] test = new int[10];
		int sum = 0;
		for (int i = 0; i < test.length; i++) {
			test[i] = scn.nextInt();
			sum += test[i];
			
		}
		System.out.println(sum / test.length);
	}

	public static int indexOf(int arr[], int element) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				index = i;
			}
		}
		return index;
	}

}