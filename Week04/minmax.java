public class minmax {

    public static void findMinAndMax(int[] num) {
        int min = 1000000, max = -100000;
        for (int x : num) {
            if (min > x)
                min = x;
            if (max < x)
                max = x;
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }
}
