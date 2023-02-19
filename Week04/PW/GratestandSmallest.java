import java.util.Arrays;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class GratestandSmallest {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(Max(arr));
        System.out.println(Min(arr));
        System.out.println(Arrays.toString(MinMax(arr)));
    
    }

    public static int Max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static int Min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
    public static int[] MinMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        int[] res={min,max};
        return res;
        
    }

}
