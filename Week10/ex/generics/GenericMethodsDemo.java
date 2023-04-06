package generics;

import javax.sound.sampled.SourceDataLine;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printAll(arr1);
        System.out.println();
        printAll(arr2);
        System.out.println();
        printAll(arr3);
        System.out.println();
        printAll(arr4);
        System.out.println();
        printAll(arr5);
        System.out.println();
        System.out.println();

        printAll(arr1, 2, 5);
        System.out.println();
        printAll(arr2, 0, 5);
        System.out.println();
        printAll(arr3, 0, 2);
        System.out.println();
        printAll(arr4, 1, 3);
        System.out.println();
        printAll(arr5, 0, 2);
        System.out.println();
        System.out.println();

        printAll(arr3);
        System.out.println();

        System.out.println(mid(arr2));
        System.out.println();
        System.out.println(mid(arr5));

        System.out.println();
        System.out.println();

        System.out.println(max(arr4));

        System.out.println();

        System.out.println("Now Sorting: ");
        sort(arr1);
        printAll(arr1);
        sort(arr2);
        printAll(arr2);
        sort(arr4);
        printAll(arr4);
        System.out.println();
        printAll(arr3);
        System.out.println();

    }

    // static void printAll(Object[] arr) {

    // for (Object x : arr)
    // System.out.print(x + " ");
    // System.out.println();
    // }

    static <T> void printAll(T[] arr) {
        for (T x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    static <T> void printAll(T[] arr, int lower, int upper) {
        if (lower < 0 || upper < 0 || lower >= arr.length || upper >= arr.length)
            throw new ArrayIndexOutOfBoundsException("Either upper or lower is out of boumds");

        else
            for (int i = lower; i <= upper; i++)
                System.out.print(arr[i] + " ");

        System.out.println();

    }

    static <T> void printAll(Task[] arr) {
        for (Task t : arr)
            System.out.println(t);

        System.out.println("Task in 2 lines: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println();
                System.out.print(arr[i]);
            } else {
                System.out.print(" " + arr[i]);
            }
        }

    }

    static <T> T mid(T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("The array is empty");

        return arr[arr.length / 2];
    }

    static <T extends Comparable<? super T>> T max(T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException();

        T max = arr[0];
        for (T el : arr)
            if (max.compareTo(el) < 0)
                max = el;
        return max;
    }

    static <T extends Comparable<? super T>> void sort(T[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    static <T> void swap(T[] arr, int x, int y) {
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}