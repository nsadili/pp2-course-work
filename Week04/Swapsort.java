import java.util.Arrays;

public class Swapsort {
    public static void main(String [] args){
        int arr[]= { 3, 5, 12, 7, 4, -5};
        for(int i=0; i<arr.length; i++ ){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]= arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
                
            }

           
        }
        System.out.println(Arrays.toString(arr));
    }
    
}