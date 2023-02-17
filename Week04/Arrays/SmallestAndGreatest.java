package Week4.Arrays;

public class SmallestAndGreatest {
    public static void main(String args[]){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = -1000000;
        int min = 1000000;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max+"    Min: "+min);

    }
}
