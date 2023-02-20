package pp2.week04;

import java.util.*;

public class MinMaxArr {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7};

        System.out.println("min: " + findMinimum(array));

        System.out.println("max: " + findMaximum(array));

    }

    public static int findMaximum(int [] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinimum (int [] arr)
    {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

}