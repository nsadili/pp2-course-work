package generics;

import java.util.Arrays;

public class GenericsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };
        System.out.println(middle(arr1));

        System.out.println(max(arr4));

        printAll(arr2);
        //sorter(arr2);

        printAll(arr2);

        printAll(arr2, 1, 2);

        printAll(arr2, 2, 1);

    }

    static <T> void printAll(T[] arr){

        System.out.println(Arrays.toString(arr));

    }
    
    static <T> void printAll(T[] arr, int lowerIndex, int higherIndex){
        
        if(lowerIndex < 0 || higherIndex < 0){
            throw new IllegalArgumentException("Invalid index");
        }

        int indices[] = new int[]{lowerIndex, higherIndex};

        swapIndices(indices);

        lowerIndex = indices[0];

        higherIndex = indices[1];

        System.out.print("[");
        for(int i = lowerIndex; i <= higherIndex; i++){
            System.out.print(arr[i]);

            if(i != higherIndex){
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
    static void printAll(Task[] tasks){
        for(Task task: tasks){
            System.out.println(task);
        }
    }

    static <T> T middle(T[] arr){
        
        if(arr.length == 0){
            throw new IllegalArgumentException();
        }
        return arr[arr.length/2];
    }

    static <T extends Comparable<T>> T max(T[] arr){

        T maxEl = arr[0];

        for(T el: arr){
            if(el.compareTo(maxEl) > 0){
                maxEl = el;
            }
        }

        return maxEl;
    }

    static <T extends Comparable<? super T>> void sorter(T[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                swap(arr, j, j-1);
            }
        }
    }

    static <T> void swap(T[] arr, int x, int y){
        T tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    static void swapIndices(int []arr){
        if(arr[0] >= arr[1]){
            int tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }
    }
}
