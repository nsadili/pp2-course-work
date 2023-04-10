public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 6, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };


        printAll(arr1);
        printAll(arr2);
        printAll(arr3);


        System.out.println(middleEl(arr5));
        System.out.print(maxEl(arr3));
        System.out.println();

        sort(arr1);
        printAll(arr1);

    }

    public  static <T> void printAll(T[] arr1) {
        printAll(arr1,0,arr1.length-1);
    }

    public static <T> void printAll(T[] arr1,int l,int u ) {

        if(arr1.length==0) {
            throw new IllegalArgumentException("Input array is empty!");
        }

        if(u >= arr1.length || l<0 || u >= arr1.length || l<0) {
            throw new ArrayIndexOutOfBoundsException("Either upper or lower bound is out of array bounds!");
        }

        for(int i=l;i<=u;i++) {
            System.out.print(arr1[i]+" ");
        } System.out.println();
    } 

    public static void printAll(Task[] arr) {

        if(arr.length==0) {
            throw new IllegalArgumentException("Input array is empty!");
        }

        for(int i=0;i<arr.length;) {
            for(int j=0;j<2 && i<arr.length;j++) {
                System.out.print(arr[i]+" ");
                i++;
            }
            System.out.println();
        }
    }

    public static <T> T middleEl(T[] arr) {

        if(arr.length%2==0) {
            return arr[(arr.length/2)-1];
        } else return arr[(arr.length)/2];
    }

    public static <T extends Comparable<? super T>> T  maxEl(T[]arr) {
        T max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i].compareTo(max)>0) max=arr[i];
        }

        return max;
    }

    static <T extends Comparable<? super T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {// 1>2
                    swap(arr, i, j);
                }
            }
        }

    }

    static <T> void swap(T[] arr, int x, int y) {
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
}

