import java.util.Scanner;
public class pw2 {
    public static int maximum(int [] arr)
    {
        int ans = arr[0];
        for(int i=1; i < arr.length; i++){
            if(ans < arr[i])
            {
              ans = arr[i];
            }
        }
        return ans;
    }

   
    public static int minimum(int [] arr)
    {
        int ans = arr[0];
        for(int i=1; i < arr.length; i++){
            if(ans > arr[i])
            {
              ans = arr[i];
            }
        }
        return ans;
    }


    private static int[] maximumAndMinimum (int [] arr) {
        int maxVal=maximum(arr);
        int minVal=minimum(arr);
        int [] res = {maxVal, minVal};
        return res;
    }
    public static void main(String[] args) {
        int n=args.length;
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= Integer.valueOf(args[i]);
        }
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        int[] ans=maximumAndMinimum(arr);
        System.out.println(maximum(arr));
    }

}
