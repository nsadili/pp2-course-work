import java.util.Arrays;
import java.util.Scanner;

public class MinMaxV3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        if (size == 0) {
            System.out.println("Size must be positive!");
            System.exit(0);
        }

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++)
            nums[i] = scan.nextInt();

        scan.close();

        Pair res = new MinMaxV3().getMinMax(nums);  

        System.out.println(Arrays.toString(nums));
        // System.out.println(res);
        if (res == null)
            System.out.println("Array is empty!");
        else
            System.out.println("Min: " + res.x + ", " + "Max: " + res.y);

    }

    Pair getMinMax(int[] nums) {
        if (nums.length == 0)
            return null;

        int min = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }

        return new Pair(min, max);
    }
}

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
