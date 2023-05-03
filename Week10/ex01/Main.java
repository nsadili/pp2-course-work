package Week10.ex01;
import java.util.Arrays;

import Week06.Point;

class Task {
    private String task;

    public Task(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] intArr = new int[] {1, 2, 3};
        double[] doubleArr = new double[]{1.1, 1.2, 1.3};
        String[] stringArr = new String[]{"Sadiq, Ali"};
        Task[] taskArr = new Task[]{new Task("task1"), new Task("task2")};
        Point[] pointArr = new Point[] {new Point(1, 2), new Point(3, 5)};

        
        printArray(stringArr);
        printArray(taskArr);
        printArray(pointArr);

        printArray(Arrays.stream(intArr).boxed().toArray(Integer[]::new));
        printArray(Arrays.stream(doubleArr).boxed().toArray(Integer[]::new));

    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] array, int lowerIndex, int upperIndex) throws IndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Task[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i] + " " + ((i+1 < array.length) ? array[i+1] : ""));
        }
    }

    public static <T> T middleElement(T[] array) {
        if (array.length % 2 != 0)
            return array[(array.length - 1) / 2];
        else 
            return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

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