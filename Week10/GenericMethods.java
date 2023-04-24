import java.util.Arrays;

public class GenericMethods {

    public static void main(String[] args) {
        // Define arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};
        Task[] taskArray = {new Task("Task 1"), new Task("Task 2"), new Task("Task 3"), new Task("Task 4"), new Task("Task 5")};
        Point[] pointArray = {new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8), new Point(9, 10)};

        // Print elements of arrays
        System.out.println("Integer Array:");
        printArray(intArray);
        System.out.println("\nDouble Array:");
        printArray(doubleArray);
        System.out.println("\nString Array:");
        printArray(stringArray);
        System.out.println("\nTask Array:");
        printArray(taskArray);
        System.out.println("\nPoint Array:");
        printArray(pointArray);

        // Print elements of arrays within a specified range
        System.out.println("\nInteger Array - Range (1, 4):");
        printArray(intArray, 1, 4);
        System.out.println("\nDouble Array - Range (0, 3):");
        printArray(doubleArray, 0, 3);
        System.out.println("\nString Array - Range (2, 6):");
        printArray(stringArray, 2, 6);
        System.out.println("\nTask Array - Range (1, 3):");
        printArray(taskArray, 1, 3);
        System.out.println("\nPoint Array - Range (0, 2):");
        printArray(pointArray, 0, 2);

        // Print two tasks in a single line
        System.out.println("\nTask Array - 2 Tasks per line:");
        printTasks(taskArray);

        // Get middle element of arrays
        System.out.println("\nMiddle Element of Integer Array: " + getMiddleElement(intArray));
        System.out.println("Middle Element of Double Array: " + getMiddleElement(doubleArray));
        System.out.println("Middle Element of String Array: " + getMiddleElement(stringArray));
        System.out.println("Middle Element of Task Array: " + getMiddleElement(taskArray));
        System.out.println("Middle Element of Point Array: " + getMiddleElement(pointArray));

        // Get maximum element of arrays
        System.out.println("\nMaximum Element of Integer Array: " + getMaximumElement(intArray));
        System.out.println("Maximum Element of Double Array: " + getMaximumElement(doubleArray));
        // System.out.println("Maximum Element of String Array: " + getMaximumElement(stringArray)); // This will throw an exception as String does not implement Comparable
        // System.out.println("Maximum Element of Task Array: " + getMaximumElement(taskArray)); // This will throw an exception as Task does not implement Comparable
        // System.out.println("Maximum Element of Point Array: " + getMaximumElement(pointArray)); // This will throw an exception as Point does not implement Comparable

        // Sort arrays using bubble sort
        System.out.println("\nInteger Array - Unsorted:");
        printArray(intArray);
        bubbleSort(intArray);
        System.out.println("Integer Array - Sorted:");
       
