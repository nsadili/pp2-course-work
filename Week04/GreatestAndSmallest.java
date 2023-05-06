package Week04;

import javax.sound.sampled.SourceDataLine;

public class GreatestAndSmallest {
    int[] arr = {3, 7, 1, 9, 4, 6};
    int[] result = findMinMax(arr);
   System.out.println("Minimum: " + result[0]);
   System.out.println("Maximum: " + result[1]);

public static int[] findMinMax(int[] arr) {
    int[] result = new int[2];
    result[0] = arr[0]; // initialize min to first element
    result[1] = arr[0]; // initialize max to first element
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < result[0]) {
            result[0] = arr[i]; // update min if current element is smaller
        }
        if (arr[i] > result[1]) {
            result[1] = arr[i]; // update max if current element is larger
        }
    }
    
    return result;
}

}
