public class MinMax {
    public static void main(String[] args) {
        if(args.length == 0) {
        return;
        }
    }
    public static int minValue(int[] arr) {
    int minValue = 1000000;
    for ( int i = 1; i <arr.length; i++)
    {
        if(arr[i]<minValue) {
            minValue=arr[i]; 
        }
    }
    return minValue;
}
public static int maxValue(int[] arr) {
    int maxValue = -1000000;
    for (int  i = 1; i <arr.length; i++) 
    {
        if(arr[i]>maxValue) {
            maxValue=arr[i];
        }
    }
    return maxValue;
}
}