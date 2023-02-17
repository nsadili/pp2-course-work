package Week4.Arrays;

public class SmallestElement {
    public static int smallest(int[]arr){
        int min = 1000000;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(smallest(arr));
    }
    
}
