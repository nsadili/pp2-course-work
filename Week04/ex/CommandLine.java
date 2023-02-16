
import java.util.Arrays;

public class CommandLine {

    public static void main(String[] args) {

        // a

        if (args.length == 0) {

            System.out.println("please ,enter num");

            System.exit(1);
        }
        System.out.println(Arrays.toString(args));

        int[] nums = new int[args.length];
        for (int i = 0; i < args.length - 1; i++) {

            nums[i] = Integer.parseInt(args[i]);

        }

        printArr(nums);

        sum(nums);


    }

    static void printArr(int[] arr) {

        for (int x : arr) {

            System.out.println(x + " ");
        }

        System.out.println();


    }


    static int sum(int[] arr){
        var sum = 0;
        for (var x : arr)
        sum += x;
        return sum;

    }
}




