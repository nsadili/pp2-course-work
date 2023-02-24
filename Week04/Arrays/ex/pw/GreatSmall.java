package Week04.Arrays.ex.pw;
import java.util.Arrays;
public class GreatSmall {
    public static void main(String[] args) {

        int[] nums = new int[args.length];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.valueOf(args[i]);

        if (nums.length == 0 || nums.length < 0) {
            System.out.println("No values provided!");
            System.exit(0);
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("Min: " + min + ", " + "Max: " + max);
    }

}
