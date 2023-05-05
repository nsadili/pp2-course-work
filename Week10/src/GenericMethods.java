import Related_Classes.*;

public class GenericMethods {
    public static void main(String[] args) throws Exception {
        //a
        int[] intArray = { 1, 2, 3, 4, 5 };
        double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] stringArray = { "apple", "banana", "orange", "grape", "mango" };
        Task[] taskArray = { new Task("task1"), new Task("task2"), new Task("task3"), new Task("task4"), new Task("task5"), new Task("task6") };
        Point[] pointArray = { new Point(0, 0), new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4, 4) };

        // printArray(intArray); this returns an error
        // printArray(doubleArray); this returns an error
        // printArray(stringArray);
        // printArray(taskArray);
        // printArray(pointArray);

        // printArray(pointArray, 1, 9);

        // System.out.println(getMiddleElement(pointArray));
        // System.out.println(getMaxElement(pointArray)); this returns an error
        // bubbleSort(pointArray); this returns an error
    }

    //b
    public static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }


    //c
    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) throws ArrayIndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    

    //d
    public static void printArray(Task[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 2 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    

    //e
    public static <T> T getMiddleElement(T[] array) {
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }


    //f
    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    //g
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
