public class findMinAndMax {
    public static void findMinAndMax(int[] arr) {
        int min = 1000000, max = -100000;
        for (int x : arr) {
            if(min > x) min = x;
            if(max < x) max = x;
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }
}
