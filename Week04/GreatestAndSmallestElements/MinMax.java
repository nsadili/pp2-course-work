package GreatestAndSmallestElements;

public class MinMax {
    public static int findMin(int [] arr){
        int min = 1000;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < min) min = arr[i];
        return min;
    }

    public static int findMax(int [] arr){
        int max = -1000;
        for(int i = 0; i < arr.length; i++)
        if(arr[i] > max) max = arr[i];
        return max;
    }

    public static void findMinMax(int [] arr){
        System.out.println("Max is " + findMax(arr));
        System.out.println("Min is " + findMin(arr));
    }
}
