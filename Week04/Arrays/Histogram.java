package Week4.Arrays;

import java.util.Arrays;

public class Histogram {
    
    public static void main(String args[]){
        int[] arr = new int[]{0, 2, 5, 8, 3, 6, 7, 0, 3, 3};
        int sum = 0;
        int median = 0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int mean = sum/arr.length;
        System.out.println("Mean: "+mean);

        
        for(int i=0; i<arr.length; i++){
            Arrays.sort(arr);
            if(arr.length%2==0){
                median = arr[arr.length/2]; 
            }else  median = (arr[(arr.length-1)/2]+arr[arr.length/2])/2;
        }
        System.out.println("Median: "+median);

        System.out.println("Mode: "+mostFrequent(arr, arr.length));
        
    }

    public static int mostFrequent(int[] arr, int n){
        int maxCount = 0;
        int max_repeated_element = 0;
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }

            if(cnt>maxCount){
                maxCount=cnt;
                max_repeated_element=arr[i];
        }
        }
        return max_repeated_element;
    }
}
