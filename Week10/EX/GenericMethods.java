package EX;
public class GenericMethods {
    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        Double[] nums2 = { 1.0, 2.0, 3.0, 4.0 };
        String[] words = { "aslfj", "iuabsnf", "saff", "ijqinwd", "akjshf" };
        Task[] tasks = { new Task("afsa"), new Task("asfas1"), new Task("qfqeg") };
        Point[] points = { new Point("15125"), new Point("112125"), new Point("151125") };

        print(nums);
        print(nums2);
        print(words);
        print(tasks);
        print(points);
        System.out.println("middle element "+ middle(nums));
        System.out.println("last element "+ last(tasks));
    }

    public static <T> void print(T[] array) {
        for (T el : array) {
            System.out.println(el.toString());
        }
    }

    public static void print(Task[] array) {
        int count = 0;
        for (Task el : array) {
            if (count % 2 == 0) {
                System.out.println(el.toString());
            } else {
                System.out.print(el.toString());
            }
            count++;
        }
    }

    public static <T> void print(T[] array, int lowerIndex, int upperIndex) throws ArrayIndexOutOfBoundsException {
        if (lowerIndex < 0 || upperIndex >= array.length || lowerIndex > upperIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static <T> T middle(T[] array) {
        return array[(int) (array.length / 2)];
    }

    public static <T> T last(T[] array) {
        return array[array.length-1];
    }

}

class Point {
    String point;

    public Point(String point) {
        this.point = point;
    }
}

class Task {
    String task;

    public Task(String task) {
        this.task = task;
    }
}