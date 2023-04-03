import java.util.*;

public class SortArray {

    public static void main (String[] args){
        int arr[] = {6,90,10};
        for (int i = 0; i < arr.length; i++ ){ 
            for (int j = i+1; j < arr.length; j++ )
            if (arr[i]>arr[j])
            {
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}
