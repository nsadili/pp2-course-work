package Week10.ex1;

import Week10.generics.*;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };
        printAll(arr1);
        printAll(arr2);
        printAll(arr3);
        printAll(arr4);
        printAll(arr5);
        System.out.println(middle(arr1));
        System.out.println(middle(arr2));
        System.out.println(middle(arr3));
        System.out.println(maximum(arr2));
        System.out.println(maximum(arr3));
        System.out.println(maximum(arr4));
        sort(arr4);
        printAll(arr4);
    }

    private static <T> void printAll(T[] arr) {
        printAll(arr, 0);
    }

    private static <T> void printAll(T[] arr, int start) {
        printAll(arr, start, arr.length);
    }

    private static <T> void printAll(T[] arr, int start, int end) {
        if (arr.length == 0)
            throw new IllegalArgumentException("The provided array is empty.");
        
        if (start > end) 
            throw new IllegalArgumentException("The start index is larger than the end index.");

        if (start < 0 || end > arr.length)
            throw new ArrayIndexOutOfBoundsException("The provided index is out of bounds of the array.");
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void printAll(Task[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 0) System.out.print(arr[i] + " ");
            else System.out.println(arr[i]);
        }
        if (i % 2 == 1) System.out.println();
    }

    private static <T> T middle(T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("The provided array is empty.");
        return arr[arr.length / 2];
    }

    private static <T extends Comparable<? super T>> T maximum(T[] arr) {
        T maxEl = arr[0];
        for (T el : arr) if (el.compareTo(maxEl) > 0) maxEl = el;
        return maxEl;
    }

    private static <T extends Comparable<? super T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
