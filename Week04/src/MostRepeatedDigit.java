import java.util.*;

public class MostRepeatedDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int maxCount = 0;
		int mostRepeatedDigit = 0;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int[] digitCount = new int[10];
		for (int i = 0; i < size; i++) {
			int number = arr[i];
			while (number != 0) {
				int digit = number % 10;
				digitCount[digit]++;
				number /= 10;
			}
		}

		for (int i = 0; i < digitCount.length; i++) {
			if (digitCount[i] > maxCount) {
				maxCount = digitCount[i];
				mostRepeatedDigit = i;
			}
		}

		System.out.print(mostRepeatedDigit);
	}
}
