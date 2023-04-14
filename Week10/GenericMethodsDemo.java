package Week10;


public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printItems(arr1);
        printItems(arr2);
        printItems(arr3);
        printItems(arr4);
        printItems(arr5);

        getMiddleElement(arr2);

        MaxVal(arr1);
    }

    static <T> void printItems(T[]arr){
        for(T i: arr){
            System.out.println(i);
        }
    }

    static <T> void printItems(T[]arr, int lower , int upper){
        if( lower < 0 || upper > arr.length) throw new ArrayIndexOutOfBoundsException();
        
        for(int i= lower; i<upper; i++){
            System.out.println(i);
        }
    }

    static <T> T getMiddleElement(T[] arr){
        int index = arr.length / 2;
        return arr[index];
    }

    static <T extends Comparable> T MaxVal(T[] arr){
        T max = arr[0];
        for(T i: arr){
            if(max.compareTo(i)< 0){
                max = i;
            }
        }
        return max;

    }


}
