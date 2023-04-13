package generics;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printAll(arr2);
        printAll(arr3);

       
    }

    static void printAll(Object[] arr1) {
        for (Object el: arr1)
        System.out.println(el + " ");
        System.out.println();
    }

    static <T> void printAll(T[] arr1) {
        // for (T el : arr)
        // System.out.print(e1 + " ");
        // System.out.println();
        printAll(arr, l : 0, arr.length - 1)

    }
    static <T> void printAll(T[] arr, int l, int u) {
        if(arr.length == 0)
        throw new IllegalArumentException("input array is empty");

        if(u >=arr.length || l < 0 || l >= arr.length || u<0)
        throw new ArrayIndexOutOfBoundsException("Either upper or lower index is empty");

        for (int i=l; i<=u; i++)
        System.out.print(arrr[i] + " ");
        System.out.println();

        static void printaAll(Task[] tasks) {
            for(Task task : tasks)
            System.out.println(tast);
        }

    }
    static <T> T middle(T[] arr) {

        if(arr.length == 0) throw new IllegalArgumentException("Input array cannot be empty");
        return arr[arr.length / 2];
    }

}