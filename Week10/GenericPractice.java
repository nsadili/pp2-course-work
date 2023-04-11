class Task {
    private String name;
    private String description;
    private boolean isCompleted;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', description='" + description + "', isCompleted=" + isCompleted + "}";
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}

public class GenericPractice {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        Task[] taskArray = {
            new Task("Task 1", "Description 1"),
            new Task("Task 2", "Description 2"),
            new Task("Task 3", "Description 3"),
            new Task("Task 4", "Description 4"),
            new Task("Task 5", "Description 5")
        };
        Point[] pointArray = {
            new Point(1, 1),
            new Point(2, 2),
            new Point(3, 3),
            new Point(4, 4),
            new Point(5, 5)
        };

        print(intArray);
        print(doubleArray);
        print(stringArray);
        print(taskArray);
        print(pointArray, 1, 3);
    }

    public static <T> void print(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T> void print(T[] array, int lowerIndex, int upperIndex) throws ArrayIndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index range.");
        }

        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.println(array[i]);
        }
    }

    public static void print(Task[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i % 2 == 1) {
                System.out.println();
            }
        }
    }

    public static <T> T middleElement(T[] array) {
        return array[array.length / 2];
    }
}