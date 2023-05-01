package Week10.ex;
public class Exercise01 {
    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"car", "fruit", "house", "battery", "butter"};
        Task[] taskArray = {new Task("Task1"), new Task("Task2"), new Task("Task3"), new Task("Task4"), new Task("Task5")};
        Point[] pointArray = {new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8), new Point(9, 10)};

        System.out.println("Printing intArray:");
        printArray(intArray);
        System.out.println("Printing doubleArray:");
        printArray(doubleArray);
        System.out.println("Printing stringArray:");
        printArray(stringArray);
        System.out.println("Printing taskArray:");
        printArray(taskArray);
        System.out.println("Printing pointArray:");
        printArray(pointArray);

        System.out.println("Printing stringArray with specified range (index 1 to 3):");
        printArray(stringArray, 1, 3);

        System.out.println("Printing taskArray with two tasks in a single line:");
        printArray(taskArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new ArrayIndexOutOfBoundsException("Invalid range");
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void printArray(Task[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i].toString() + " ");
            if (i + 1 < array.length) {
                System.out.print(array[i + 1].toString());
            }
            System.out.println();
        }
        System.out.println();
    }

    static class Task {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}

class Exercise01_2 {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 6};
        System.out.println("Middle element of intArray: " + getMiddleElement(intArray));
        System.out.println("Maximum element of intArray: " + getMaxElement(intArray));
        System.out.println("Sorting intArray using bubble sort:");
        bubbleSort(intArray);
        printArray(intArray);
        System.out.println("Swapping first and second elements of intArray:");
        swap(intArray, 0, 1);
        printArray(intArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> T getMiddleElement(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty or nothing is given");
        }
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }

    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty or nothing is given");
        }
        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
