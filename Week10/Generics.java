import java.util.Arrays;
import java.util.*;

public class Generics {
    public static void main(String[] args) {
        
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "orange", "grape", "melon"};
        Task[] taskArray = {new Task("Task 1"), new Task("Task 2"), new Task("Task 3"), new Task("Task 4"), new Task("Task 5")};
        Point[] pointArray = {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1), new Point(10, 0)};

        // Print arrays
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);

        // Print range arrays
        printArray(intArray, 1, 3);
        printArray(doubleArray, 0, 4);
        printArray(stringArray, 2, 4);
        printArray(taskArray, 0, 2);
        printArray(pointArray, 1, 3);

        // Print Tasks with 3 per line
        printArray(taskArray, 3);

        // Get middle elementes
        System.out.println("Middle element of intArray: " + getMiddleElement(intArray));
        System.out.println("Middle element of doubleArray: " + getMiddleElement(doubleArray));
        System.out.println("Middle element of stringArray: " + getMiddleElement(stringArray));
        System.out.println("Middle element of taskArray: " + getMiddleElement(taskArray));
        System.out.println("Middle element of pointArray: " + getMiddleElement(pointArray));

        // Get maximum elements
        System.out.println("Maximum element of intArray: " + getMaxElement(intArray));
        System.out.println("Maximum element of doubleArray: " + getMaxElement(doubleArray));
        System.out.println("Maximum element of stringArray: " + getMaxElement(stringArray));
        System.out.println("Maximum element of taskArray: " + getMaxElement(taskArray));
        System.out.println("Maximum element of pointArray: " + getMaxElement(pointArray));

        // Sort arrats
        sortArray(intArray);
        sortArray(doubleArray);
        sortArray(stringArray);
        sortArray(taskArray);
        sortArray(pointArray);

        //print sorted arrays
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new IllegalArgumentException("Invalid range!");
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Task[] array, int tasksPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % tasksPerLine == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static <T> T getMiddleElement(T[] array) {
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }

    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void sortArray(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
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

    static class Task {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}

