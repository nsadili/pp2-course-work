package practicalwork;

import java.util.Arrays;

public class HistogramTask {
	public static void main(String[] args) {

		int[] grades = { 1, 2, 9, 10, 7, 6, 4, 3, 8, 1, 1 };
		
		int[] histogram = new int[11];

		
		for (int i = 0; i < grades.length; i++) {
			
			histogram[grades[i]]++;
		}

		
		for (int i = 0; i < histogram.length; i++) {
			
			System.out.println(i + ": " + histogram[i]);
		}

		
		int mean = calculateMean(grades);
		
		int median = calculateMedian(grades);
		
		int mode = calculateMode(grades);

		
		System.out.println("Mean: " + mean);
		
		System.out.println("Median: " + median);
		
		System.out.println("Mode: " + mode);
	}

	public static int calculateMean(int[] grades) {

		int sum = 0;

		for (int i = 0; i < grades.length; i++) {

			sum += grades[i];
		}

		return sum / grades.length;
	}

	public static int calculateMedian(int[] grades) {
		Arrays.sort(grades);

		int middle = grades.length / 2;

		if (grades.length % 2 == 0) {

			return (grades[middle - 1] + grades[middle]) / 2;

		} else {

			return grades[middle];

		}
	}

	public static int calculateMode(int[] grades) {

		Arrays.sort(grades);

		int mode = grades[0];

		int maxCount = 1;

		int currentCount = 1;

		for (int i = 1; i < grades.length; i++) {

			if (grades[i] == grades[i - 1]) {

				currentCount++;

			} else {

				if (currentCount > maxCount) {

					maxCount = currentCount;

					mode = grades[i - 1];
				}

				currentCount = 1;
			}
		}

		if (currentCount > maxCount) {

			mode = grades[grades.length - 1];

		}

		return mode;
	}
}