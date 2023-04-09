import java.util.Arrays;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        String[] stringArray = { "work", "job", "hello", "world", "test" };
        Task[] taskArray = { new Task("Task1"), new Task("Task2"), new Task("Task3"), new Task("Task4"),
                new Task("Task5") };
        Point[] pointArray = { new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8), new Point(9, 10) };

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);

        try {
            printArray(intArray, 2, 4);
            printArray(doubleArray, 2, 4);
            printArray(stringArray, 2, 4);
            printArray(taskArray, 2, 4);
            printArray(pointArray, 2, 4);

            printArray(taskArray);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(getMiddle(intArray));
        System.out.println(getMiddle(doubleArray));
        System.out.println(getMiddle(stringArray));
        System.out.println(getMiddle(taskArray));
        System.out.println(getMiddle(pointArray));

        System.out.println(getMaximum(intArray));
        System.out.println(getMaximum(doubleArray));
        System.out.println(getMaximum(stringArray));
        System.out.println(getMaximum(taskArray));
        System.out.println(getMaximum(pointArray));

        bubbleSort(intArray);
        bubbleSort(doubleArray);
        bubbleSort(stringArray);
        bubbleSort(taskArray);
        bubbleSort(pointArray);

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);
    }

    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) throws IndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
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

    public static <T> T getMiddle(T[] array) {
        return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMaximum(T[] array) {
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
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
}

class Task implements Comparable<Task> {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Task other) {
        return this.name.compareTo(other.name);
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point other) {
        if (this.x == other.x) {
            return Integer.compare(this.y, other.y);
        } else {
            return Integer.compare(this.x, other.x);
        }
    }
}
