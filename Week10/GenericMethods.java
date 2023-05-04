package Week10;

import java.awt.*;
import java.sql.Array;
import java.util.Arrays;

public class GenericMethods {
    public static void main(String[] args) {
        int[] intArray = new int[]{5, 1, 9, 3, 8, 5};
        double[] doubleArray = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = new String[]{"Name", "Surname", "ID"};
        Point[] pointArray = new Point[]{new Point(0, 0), new Point(5, 3), new Point(9, 18)};

        //int
        print(Arrays.stream(intArray).boxed().toArray(Integer[]::new));


        System.out.println();
        //String
        System.out.println(maxElement(stringArray));
        System.out.println(middleElement(stringArray));
        sort(stringArray);
        print(stringArray);
    }

    public static <T> void print(T[] array) {
        for (T element: array) {
            System.out.print(element.toString() + ", ");
        }
    }

    public static <T> void print(T[] array, int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            System.out.print(array[i].toString() + ", ");
        }
    }

    public static <T> T middleElement(T[] array) {
        return array[(array.length - 1) / 2];
    }

    public static <T extends Comparable<T>> T maxElement(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0)
                max = element;
        }
        return max;
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1].compareTo(array[j]) > 0)
                    swap(array, j - 1, j);
            }
        }
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
