package pp2.week04;

public class GreatestAndSmallestElements {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please, provide arguments");
            System.exit(1);
        }

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        System.out.println("min = " + findMin(arr));
        System.out.println("max = " + findMax(arr));

        MinAndMax minAndMax = findMinAndMax(arr);
        System.out.println("min = " + minAndMax.min + ", max = " + minAndMax.max);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int el : arr) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int el : arr) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    public static MinAndMax findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int el : arr) {
            if (el < min) {
                min = el;
            }
            if (el > max) {
                max = el;
            }
        }
        return new MinAndMax(min, max);
    }

    public static class MinAndMax {
        private final int min;
        private final int max;

        public MinAndMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }
}
