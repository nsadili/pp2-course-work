package Week4.Arrays;
public class AverageOfArray{
    public static void main(String args[]){
        //72
        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        int sum  = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }

        int avg = sum/arr.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);

    } 
}