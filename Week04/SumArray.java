import java.util.Arrays;

public class SumArray
{
    public static void main(String[] args)
    {
        if(args.length == 0)
        {
            System.out.println("Please enter at least a number");
            System.exit(1);
        }
        
        //printing command line argument
        System.out.println(Arrays.toString(args));
        
        int[] nums = new int[args.length]; // because of right side we can use "var"
        for(int i = 0; i < args.length; i++)
        {
           nums[i] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(nums));


        int sum = sumArr(nums);
        System.out.println("Sum: " + sum);
    }

    private static void printArr(int[] arr)
    {
        for(int el : arr)
        {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    private static int sumArr(int[] arr)
    {
        int sum = 0;
        for(int el : arr)
        {
            sum += el;
        }
        return sum;
    }
}