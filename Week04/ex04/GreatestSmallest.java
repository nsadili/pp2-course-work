import java.util.Arrays;
import java.util.Scanner;
public class GreatestSmallest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase, enter numbers: ");
        int n = sc.nextInt(); // takes the number of inputs
        int[] arr = new int[n]; //creates an array with the length of n which is determined by the user

        for (int i = 0; i < n; i++){ 
            arr[i] = sc.nextInt();
        }
        System.out.println("Min: " + Min(arr, n));
        System.out.println("Max: " + Max(arr, n));

        int[] minmax = MinMax(arr, n);

    }

private static int Min(int arr[],int n){
    int min = 10000;
    for(int i = 0; i < n; i++){ 
        if(arr[i] < min)  
        min = arr[i];
    }        
        return min;
}
private static int Max(int arr[],int n){
    int max = -10000;
    for(int i = 0; i < n; i++){ 
        if(arr[i] > max)
        max = arr[i];
    }
        return max;
}
private static int[] MinMax(int arr[], int n) {
    int[] values = new int[2];
    
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    values[0] = max;
    values[1] = min;

    return values;
}
}