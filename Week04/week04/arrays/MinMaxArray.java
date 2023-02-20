package pp2.week04.arrays;
import java.util.*;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 12, 6};
        System.out.println("min: " + findMinimum(array));
        System.out.println("max: " + findMaximum(array));
    }
    public static int findMinimum (int [] array)
    {int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (min > array[i])
            {
                min = array[i];
            }
        }
        return min;
    }
    public static int findMaximum(int [] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        return max;
    }
}

