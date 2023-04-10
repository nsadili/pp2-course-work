import java.util.Arrays;

public class GenericMethods {

  public static void printArray(Object[] arr, int lo, int hi) {
    if (lo < 0 || hi >= arr.length || lo > hi) {
      throw new IndexOutOfBoundsException("Index out of range");
    }
    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, lo, hi + 1)));
  }

  public static void printTaskArray(Task[] tasks) {
    for (int i = 0; i < tasks.length; i += 2) {
      System.out.print(tasks[i]);
      if (i + 1 < tasks.length) {
        System.out.print(", " + tasks[i + 1].toString());
      }
      System.out.println();
    }
  }

  public static <T> T getMiddle(T[] arr) {
    return arr[arr.length / 2];
  }

  public static <T extends Comparable<T>> T getMax(T[] arr) {
    T max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i].compareTo(max) > 0) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void swap(Object[] arr, int i, int j) {
    Object tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          swap(arr, j, j + 1);
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] arr1 = {1, 2, 3, 4, 5};
    Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
    String[] arr3 = {"apple", "banana", "orange", "pear", "watermelon"};
    Task[] arr4 = {new Task("Task1", 1), new Task("task2", 2), new Task("task3", 3), new Task("task4", 4), new Task("task5", 5)};
    Point[] arr5 = {new Point(0, 0), new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4, 4)};

    printArray(arr1, 1, 3);
    printArray(arr2, 0, 2);
    printArray(arr3, 2, 4);
    printArray(arr4, 1, 3);
    printArray(arr5, 0, 3);

    printTaskArray(arr4);

    System.out.println(getMiddle(arr1));
    System.out.println(getMiddle(arr2));
    System.out.println(getMiddle(arr3));
    System.out.println(getMiddle(arr4));
    System.out.println(getMiddle(arr5));

    System.out.println(getMax(arr1));
    System.out.println(getMax(arr2));
    System.out.println(getMax(arr3));
    System.out.println(getMax(arr4));
    System.out.println(getMax(arr5));

    bubbleSort(arr1);
    bubbleSort(arr2);
    bubbleSort(arr3);
    bubbleSort(arr4);
    bubbleSort(arr5);

    printArray(arr1, 0, 4);
    printArray(arr2, 0, 4);
    printArray(arr3, 0, 4);
    printArray(arr4, 0, 4);
    printArray(arr5, 0, 4);
  }
}

class Point implements Comparable<Point> {
  private int x;
  private int y;

  public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }

  public String toString() {
      return "(" + x + ", " + y + ")";
  }

  public int compareTo(Point other) {
      if (x == other.getX()) {
          return y - other.getY();
      } else {
          return x - other.getX();
      }
  }
}

class Task implements Comparable<Task> {
  private String name;
  private int priority;

  public Task(String name, int priority) {
      this.name = name;
      this.priority = priority;
  }

  public String getName() {
      return name;
  }

  public int getPriority() {
      return priority;
  }

  public String toString() {
      return name + " (" + priority + ")";
  }

  public int compareTo(Task other) {
      return priority - other.getPriority();
  }
}
