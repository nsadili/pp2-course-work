import java.util.Arrays;

public class GenericMethods {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        String[] stringArray = { "Vasif", "Murad", "Teymur", "UzunHesen", "Ebulfez" };
        Task[] taskArray = { new Task("Task1"), new Task("Task2"), new Task("Task3"), new Task("Task4"),
                new Task("Task5") };
        Point[] pointArray = { new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4, 4), new Point(5, 5) };

        System.out.println("Printing all elements of arrays:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);

        System.out.println("\nPrinting a specified range of arrays:");
        try {
            printArray(intArray, 1, 3);
            printArray(doubleArray, 0, 2);
            printArray(stringArray, 2, 4);
            printArray(taskArray, 0, 2);
            printArray(pointArray, 3, 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nPrinting Tasks two at a time:");
        printTasks(taskArray);

        System.out.println("\nGetting the middle element of arrays:");
        System.out.println(getMiddleElement(intArray));
        System.out.println(getMiddleElement(doubleArray));
        System.out.println(getMiddleElement(stringArray));
        System.out.println(getMiddleElement(taskArray));
        System.out.println(getMiddleElement(pointArray));

        System.out.println("\nGetting the maximum element of arrays:");
        System.out.println(getMaxElement(intArray));
        System.out.println(getMaxElement(doubleArray));
        System.out.println(getMaxElement(stringArray));
        System.out.println(getMaxElement(taskArray));
        System.out.println(getMaxElement(pointArray));

        System.out.println("\nSorting arrays using bubble sort:");
        sortArray(intArray);
        sortArray(doubleArray);
        sortArray(stringArray);
        sortArray(taskArray);
        sortArray(pointArray);

        System.out.println("\nPrinting sorted arrays:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(taskArray);
        printArray(pointArray);
    }

    private static void sortArray(Point[] pointArray) {
    }

    private static void sortArray(Task[] taskArray) {
    }

    private static void sortArray(double[] doubleArray) {
    }

    private static void sortArray(int[] intArray) {
    }

    private static Object getMaxElement(Point[] pointArray) {
        return null;
    }

    private static char[] getMaxElement(Task[] taskArray) {
        return null;
    }

    private static Object getMaxElement(double[] doubleArray) {
        return null;
    }

    private static char[] getMaxElement(int[] intArray) {
        return null;
    }

    private static char[] getMiddleElement(double[] doubleArray) {
        return null;
    }

    private static char[] getMiddleElement(int[] intArray) {
        return null;
    }

    private static void printArray(double[] doubleArray, int startIndex, int endIndex) {
    }

    private static void printArray(int[] intArray, int startIndex, int endIndex) {
    }

    private static void printArray(double[] doubleArray) {
    }

    private static void printArray(int[] intArray) {
    }

    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] arr, int startIndex, int endIndex) throws Exception {
        if (startIndex < 0 || endIndex >= arr.length || startIndex > endIndex) {
            throw new Exception("Invalid range");
        }
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printTasks(Task[] tasks) {
        for (int i = 0; i < tasks.length; i += 2) {
            System.out.println(tasks[i] + " " + tasks[i + 1]);
        }
    }

    public static <T> T getMiddleElement(T[] arr) {
        return arr[arr.length / 2];
    }

    public static <T extends Comparable<T>> T getMaxElement(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T extends Comparable<T>> void sortArray(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}