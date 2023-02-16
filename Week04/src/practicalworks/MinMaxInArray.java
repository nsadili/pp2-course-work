package practicalworks;

public class MinMaxInArray {
	public static void main(String[] args) {
		int[] array = { 5, 3, 9, 2, 8, 4 };
		int smallest = array[0];
		int greatest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
			if (array[i] > greatest) {
				greatest = array[i];
			}
		}

		System.out.println("The smallest element is: " + smallest);
		System.out.println("The greatest element is: " + greatest);
	}
}
