package Week4.Arrays;

public class GreatestElement {
    public static int greatest(int[] arr){
        int max = -1000000;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(greatest(arr));
        
    }
}
