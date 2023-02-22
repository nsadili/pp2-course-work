import java.util.Arrays;

public class GreatestAndSmallest {
    public static void main(String[] args) {

        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.valueOf(args[i]);

        if (arr.length == 0) {
            System.out.println("No values provided!");
            System.exit(0);
        }

        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(Arrays.toString(arr) + "\n" + "Greatest value: " + min + ", " + "Smallest value: " + max);
    }
}
