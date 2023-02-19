import java.util.Scanner;

public class MinMax {

    public static int FindMin(int [] arr){
        int min = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]<min) min= arr[i];
        }
        return min;

    }
    public static int FindMax(int[ ] arr){
        int max = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]>max) max= arr[i];
        }
        return max;

    }
    //public int FindMaxMin(int [] arr){
        public static int[] findMinMax(int[] arr) {
            int[] result = new int[2];
            result[0] = FindMin(arr);
            result[1] = FindMax(arr);
            return result;
        }
        
    //}
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);


         int n = scanner.nextInt();
         int [] arr= new int[n];
         for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = FindMin(arr);
        int max = FindMax(arr);
        System.out.println("The minimum is: "+ min);
        System.out.println("The maximum is: " + max);
//finding both
        int[] result = findMinMax(arr);
        System.out.println("Minimum element in array: " + result[0]);
        System.out.println("Maximum element in array: " + result[1]);

   

    }
}
