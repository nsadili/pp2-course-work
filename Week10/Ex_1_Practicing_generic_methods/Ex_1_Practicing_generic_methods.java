public class Ex_1_Practicing_generic_methods {
    public static void main(String[] args) {
        //a. Here are the five arrays:
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };


    }

    //b. Here is the generic method to print the elements of an array:
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //c. Here is the overloaded print method that prints a specified range of the array:
    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) throws ArrayIndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //d. Here is the overloaded print method that prints Tasks as only two Tasks are printed in a single line:
    public static void printArray(Task[] array) {
        for (int i = 0; i < array.length; i += 2) {
            if (i + 1 < array.length) {
                System.out.println(array[i] + " " + array[i + 1]);
            } else {
                System.out.println(array[i]);
            }
        }
    }

    //e. Here is the generic method to return the middle element of an array:
    public static <T> T getMiddle(T[] array) {
        return array[array.length / 2];
    }

    //f. Here is the generic method to return the maximum element of an array:
    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    //g. Here is the generic method to sort an array using the bubble sort algorithm:
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
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