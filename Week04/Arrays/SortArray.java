package Week4.Arrays;

import java.util.Arrays;


//Sorting an array minumum to maximum
public class SortArray{
    public static void main(String args[]){
        int[] arr = new int[]{90, 10, 222, 3, 344, 5, 36, 7, 8};
        //First way to sort an array
        for(int i=0; i<arr.length; i++){
            for(int j=(i+1);j<arr.length; j++ ){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];

                }

            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //Second way to sort an array
        System.out.println("Sorting array using temp: ");
        for(int i=0; i<arr.length; i++){
            for(int j=(i+1);j<arr.length; j++){
                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //Third way to sort an array
        System.out.println("Sorting an array using sort function:");
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");

    }
    
}