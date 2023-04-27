public class MaxMinFinder {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 1, 7};
        int[] result = findMaxMin(array);
        System.out.println("Maximum: " + result[0]);
        System.out.println("Minimum: " + result[1]);
    }
    
    public static int[] findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        int[] result = {max, min};
        return result;
    }
}
