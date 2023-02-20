import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin{

 public static void main(String[] args) {

    int minValue = minOfArrayFromTerminal(args);
    System.out.println("The minimum value is: " + minValue);
   
    int maxValue = maxOfArrayFromTerminal(args);
    System.out.println("The maximum value is: " + maxValue);

 }

    public static int minOfArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array has 0 length");
            return 0;
        }

        int mn = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (mn > arr[i])
                mn = arr[i];
        }
        return mn;
    }

    public static int maxOfArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array has 0 length");
            return 0;
        }

        int mx = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (mx < arr[i])
                mx = arr[i];
        }
        return mx;
    }

    public static int minOfArrayFromTerminal(String[] arr){

        int newArr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = Integer.parseInt(arr[i]);
        }

        return minOfArray(newArr);
    }

    public static int maxOfArrayFromTerminal(String[] arr){

        int newArr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = Integer.parseInt(arr[i]);
        }

        return maxOfArray(newArr);
    }

    public static int[] returnBothMinAndMax(int[] arr){

        int newArr[] = new int[2];
        newArr[0] = minOfArray(arr);
        newArr[1] = maxOfArray(arr);

        return newArr;
    }



}