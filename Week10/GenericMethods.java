package Week10;
import java.awt.*;

public class GenericMethods {
    int[] intArray = new int[]{10, 20, 30, 40, 50};
    String[] stringArray = new String[]{"Apple", "Banana", "Cherry", "Durian"};
    Point[] pointArray = new Point[]{new Point(1, 1), new Point(6, 3), new Point(10, 20)};
    double[] doubleArray = new double[]{1.5, 2.8, 3.9, 4.1, 5.6};
    public static <G> void print(G[] array) {
        for (G element: array) {
            System.out.print(element.toString() + ", ");
        }
    }

    public static <H> void print(H[] array, int lowerBound, int upperLimit) {
        for (int i = lowerBound; i <= upperLimit; i++) {
            System.out.print(array[i].toString() + ", ");
        }
    }

    public static <T> T middleElement(T[] array) {
        return array[(array.length - 1) / 2];
    }
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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

}
