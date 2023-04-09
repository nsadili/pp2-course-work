import java.util.Arrays;

class Task {
    // Task class implementation
}

class Point {
    // Point class implementation
}

public class ArrayUtils {

    // a. Define 5 arrays of different types
    private static int[] intArray = {1, 3, 5, 7, 9};
    private static double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
    private static String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
    private static Task[] taskArray = {new Task(), new Task(), new Task(), new Task(), new Task()};
    private static Point[] pointArray = {new Point(), new Point(), new Point(), new Point(), new Point()};

    // b. Define a generic method to print the elements of an array
    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    // c. Overload the print method to accept lower and upper indexes
    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) throws ArrayIndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        }
        System.out.print("[");
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i]);
            if (i < upperIndex) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // d. Overload the print method to print Tasks as two Tasks per line
    public static void printArray(Task[] array) {
        System.out.println("Tasks:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i] + " " + (i + 1 < array.length ? array[i + 1] : ""));
        }
    }

    // e. Define a generic method to return the middle element of an array
    public static <T> T getMiddleElement(T[] array) {
        return array[array.length / 2];
    }

    // f. Define a generic method to return the maximum element of an array
    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    // g. Define a generic method to sort an array using bubble sort algorithm
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Helper method to swap elements in an array
    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Printing all arrays
        printArray(intArray);
    }

    private static void printArray(int[] intArray2) {
    }
}
