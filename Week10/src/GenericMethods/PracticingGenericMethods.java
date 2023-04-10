import java.util.Arrays;

public class PracticingGenericMethods {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] stringArray = { "apple", "banana", "cherry", "blueberry", "strawberry" };
        Task[] taskArray = { new Task("Task 1"), new Task("Task 2"), new Task("Task 3"), new Task("Task 4"),
                new Task("Task 5") };
        Point[] pointArray = { new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8), new Point(9, 10) };

        System.out.println("Printing all elements of integer array:");
        printArray(intArray);

        System.out.println("Printing elements of double array in range [2, 4]:");
        printArray(doubleArray, 2, 4);

        System.out.println("Printing tasks two per line:");
        printArray(taskArray);

        System.out.println("The middle element of string array: " + getMiddleElement(stringArray));

        System.out.println("The maximum element of point array: " + getMaxElement(stringArray));

        System.out.println("Sorting string array:");
        bubbleSort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new IndexOutOfBoundsException("Invalid range specified");
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Task[] array) {
        for (int i = 0; i < array.length; i += 2) {
            if (i + 1 < array.length) {
                System.out.println(array[i] + " " + array[i + 1]);
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static <T> T getMiddleElement(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}