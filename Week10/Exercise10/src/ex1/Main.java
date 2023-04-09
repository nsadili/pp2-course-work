package ex1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // a
        int[] a1 = {1, 8, 3, 4, -5};
        double[] a2 = {1.5, 45.7, -6.3};
        String[] a3 = {"asd", "qwe", "zxc", "uio", "jkl"};
        Task[] a4 = {new Task("Run"), new Task("Shop"), new Task("Study"),
                    new Task("Work"), new Task("Relax")};
        Point[] a5 = {new Point(1, 3), new Point(2, -1), new Point(0, 1)};

        // b
        print(Arrays.stream(a1).boxed().toArray());
        print(Arrays.stream(a2).boxed().toArray());
        print(a3);
        print(a4);
        print(a5);
        System.out.println();

        // c
        print(Arrays.stream(a1).boxed().toArray(), 2, 4);
        try {
            print(a4, 2, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // e
        System.out.println("Middle element is: " + getMiddle(a5));
        System.out.println();

        // f
        System.out.println("Maximum element is: " + getMax(Arrays.stream(a2).boxed().toArray(Double[]::new)));
        System.out.println("Maximum element is: " + getMax(a4));
        System.out.println("Maximum element is: " + getMax(a5));
        System.out.println();

        // g
        sort(Arrays.stream(a1).boxed().toArray(Integer[]::new));
        System.out.println("a1 sorted:");
        print(Arrays.stream(a1).boxed().toArray());
        
        System.out.println("a2 sorted:");
        sort(a4);
        print(a4);
    }

    // b
    public static <T> void print(T array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i != array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    // c
    public static <T> void print(T array[], int lowerIndex, int upperIndex) {
        if (lowerIndex < 0 || upperIndex >= array.length)
            throw new IllegalArgumentException("Error: Index out of bounds.");

        System.out.print("[");
        for (int i = lowerIndex; i < upperIndex; i++) {
            System.out.print(array[i].toString());
            if (i != upperIndex - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    // d
    public static void print(Task taskArray[]) {
        System.out.print("[");
        for (int i = 0; i < taskArray.length; i++) {
            System.out.print(taskArray[i].toString());
            if (i != taskArray.length - 1)
                System.out.print(", ");
            if (i % 2 != 0)
                System.out.println();
        }
        System.out.println("]");
    }

    // e
    public static <T> T getMiddle(T array[]) {
        return array[array.length / 2];
    }

    // f
    public static <T extends Comparable<T>> T getMax(T array[]) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0)
                max = array[i];
        }

        return max;
    }

    // g
    public static <T extends Comparable<T>> void sort(T array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0)
                    swap(array, i, j);
            }
        }
    }

    // i
    public static <T> void swap(T array[], int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
