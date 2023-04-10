import java.util.Arrays;

public class PracticingGeMethods {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"one", "two", "three", "four", "five"};
        Task[] taskArray = {new Task("task1"), new Task("task2"), new Task("task3"), new Task("task4"), new Task("task5")};
        Point[] pointArray = {new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8), new Point(9, 10)};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);

        printArray(intArray, 0, 3);
        printArray(doubleArray, 0, 3);
        printArray(stringArray, 0, 3);
        printArray(taskArray, 0, 3);
        printArray(pointArray, 0, 3);

        printArray(intArray, 0, 10);
        printArray(doubleArray, 0, 10);
        printArray(stringArray, 0, 10);
        printArray(taskArray, 0, 10);
        printArray(pointArray, 0, 10);

        System.out.println("Middle element of intArray is " + getMiddleElement(intArray));
        System.out.println("Middle element of doubleArray is " + getMiddleElement(doubleArray));
        System.out.println("Middle element of stringArray is " + getMiddleElement(stringArray));
        System.out.println("Middle element of taskArray is " + getMiddleElement(taskArray));
        System.out.println("Middle element of pointArray is " + getMiddleElement(pointArray));

        System.out.println("Maximum element of intArray is " + getMaximumElement(intArray));
        System.out.println("Maximum element of doubleArray is " + getMaximumElement(doubleArray));
        System.out.println("Maximum element of stringArray is " + getMaximumElement(stringArray));
        System.out.println("Maximum element of taskArray is " + getMaximumElement(taskArray));
        System.out.println("Maximum element of pointArray is " + getMaximumElement(pointArray));

        sortArray(intArray);
        sortArray(doubleArray);
        sortArray(stringArray);
        sortArray(taskArray);
        sortArray(pointArray);

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

    public static <T> void printArray(T[] array, int low, int high) {
        if (low < 0 || high > array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = low; i < high; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static <T> T getMiddleElement(T[] array) {
        return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMaximumElement(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void sortArray(T[] array) {
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
