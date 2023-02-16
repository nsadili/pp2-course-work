package Week04;
import java.util.Arrays;

public class CommandLineArguments {
        public static void main(String[]args) {
            int[] num = new int[args.length];
            for(int i = 0; i<args.length;i++) {
                num[i] = Integer.parseInt(args[i]);
            }
            printArray(num);
            int sum = getSum(num);
            double average = (double) sum/num.length;
            System.out.println("sum:| " + sum);
            System.out.println("average:} " + average);
        }
        public static void printArray(int[] arr) {
            System.out.println("array:) " + Arrays.toString(arr));
        }
        public static int getSum(int[]arr) {
            int sum = 0;
            for(int i = 0; i<arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }

