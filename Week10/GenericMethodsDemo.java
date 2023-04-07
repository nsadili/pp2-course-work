
public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printElements(arr1);
        printElements(arr2, 2, 4);
        System.out.println(getMiddleElement(arr3));
        sortElements(arr4);
        printElements(arr4);

    }

    static <T> void printElements(T[] arr) {
        for (T x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static <T> void printElements(T[] arr, int lowerIndex, int upperIndex){
        for(int i = lowerIndex; i <= upperIndex; i++){
            System.out.println(arr[i]);
        }
    }

    static <T> void printElements(T[] arr, int lowerIndex, int upperIndex){
        for(int i = lowerIndex; i <= upperIndex; i++){
            System.out.println(arr[i]);
        }
    }

    static <T> T getMiddleElement(T[] arr) {
        if (arr.length % 2 == 1) {
            int middleIndex = arr.length/2;
            return arr[middleIndex];
        } else {
            return null;
        }
    }

    static <T extends Comparable<T>> void sortElements(T[] arr) {
        T temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}