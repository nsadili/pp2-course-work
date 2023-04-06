package generics;

public class GenericMethodsDemo {
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

        // printAll(arr4, 2, 4);

        // System.out.println(midOfArray(arr4));

        // printAll(arr4);
        // System.out.println(maxOfArray(arr4));

        printAll(arr2);
        sortArray(arr2);
        printAll(arr2);
    }

    // static void printAll(Object[] arr){
    // for (Object x: arr){
    // System.out.println(x+" ");
    // }
    // System.out.println();
    // }

    static <T> void printAll(T[] arr) {
        printAll(arr, 0, arr.length - 1);
    }

    static <T> void printAll(T[] arr, int low, int up) {

        if (low < 0 || up < 0 || low >= arr.length || up >= arr.length)
            throw new ArrayIndexOutOfBoundsException("Provide a valid input>");

        for (int i = low; i < up; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static <T> void printAll(Task[] arr) {

        for (Task x : arr) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    static <T> T midOfArray(T[] arr) {

        if (arr.length == 0)
            throw new IllegalArgumentException();

        return arr[arr.length / 2];
    }

    static <T extends Comparable<? super T>> T maxOfArray(T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException();
        T max = arr[0];
        for (T elm : arr) {
            if (elm.compareTo(max) > 0)
                max = elm;
        }
        return max;
    }

    static <T extends Comparable<? super T>> void sortArray(T[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0)
                    swap(arr, j, j + 1);
            }
        }
    }

    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}