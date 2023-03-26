import java.util.Arrays;

public class pw2 {
    public static void main(String[] args) {

        int[] a = new int[args.length];
        for (int i = 0; i < a.length; i++)
            a[i] = Integer.valueOf(args[i]);

        if (a.length == 0) {
            System.out.println("No values provided!");
            System.exit(0);
        }

        int min = a[0], max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Min: " + min + ", " + "Max: " + max);
    }

}
