package generics;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printAll(arr3);
        sort(arr3);
        printAll(arr3);
        // System.out.println(middle(arr2));
        // System.out.println(middle(arr3));

    }

    // static void printAll(Object[] arr) {
    // for(Object el : arr)
    // System.out.println(el + " ");
    // System.out.println();

    // }

    static <T> void printAll(T[] arr) {
        // for(T el : arr)
        // System.out.print(el + " ");
        // System.out.println();
        printAll(arr, 0, arr.length - 1);
    }

    static <T> void printAll(T[] arr, int lower, int upper) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array cannot be empty!");
        if (lower < 0 || lower >= arr.length ||
                upper < 0 || upper >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("One of the indexes is out of bound");
        }
        for (int idx = lower; idx <= upper; idx++)
            System.out.print(arr[idx] + " ");
        System.out.println();

    }

    static void printAll(Task[] tasks) {
        for (Task task : tasks)
            System.out.println(task);
    }

    static <T> T middle(T[] arr) {

        if (arr.length == 0)
            throw new IllegalArgumentException("Array cannon be empty!");
        return arr[arr.length / 2];
    }

    static <T extends Comparable<? super T>> T max(T[] arr) {

        T maxEl = arr[0];
        for (T el : arr)
            if (el.compareTo(maxEl) > 0)
                maxEl = el;

        return maxEl;
    }

    static <T extends Comparable<? super T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {// 1>2
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
