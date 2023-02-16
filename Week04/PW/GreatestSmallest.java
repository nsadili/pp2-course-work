
import java.util.Arrays;
import java.util.Scanner;
public class GreatestSmallest{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println("MIN: " + MIN(arr, n));
        System.out.println("MAX: " + MAX(arr, n));
        int[] maxmin = MAXMIN(arr, n);
        System.out.println("MAX/MIN: " + Arrays.toString(maxmin));
    }

private static int MIN(int arr[],int n){
    int min=100000;
    for(int i=0;i<n;i++)
if(min>arr[i])  min=arr[i];
    return min;
}
private static int MAX(int arr[],int n){
    int max=-100000;
    for(int i=0;i<n;i++)
if(max<arr[i])  max=arr[i];
    return max;
}
private static int[] MAXMIN(int arr[], int n) {
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
