package Week03.Arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 3420394;
        int index = -1;
        while(n>0) {
            arr[n%10] +=1;
            n/=10;
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if(max<arr[i]) { 
                max = arr[i];
                index = i;
            }
        }
        System.out.println(index);

    }
}
