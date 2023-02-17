package Week4.Arrays;

public class ReverseArray {
    public static void main(String args[]){
        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        for(int i=(arr.length-1);i>=0; i-- ){
            System.out.print(arr[i]+" ");
        }
    }
}
