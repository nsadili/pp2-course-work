import java.util.Arrays;

public class CommandLine {
    public static void main(String args[]) {

        if(args.length==0) {
            System.out.println("Please enter a value: "+args);
            System.exit(1);
        }

        int arr[]=new int[args.length];
        for(int i=0;i<args.length;i++) {
            arr[i]=Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(args));

        printArray(arr);

        System.out.println(sum(arr));
    }

    private static void printArray(int ar[]) {

        for(var x: ar) {
            System.out.print(x+" ");
        }

    }

    public static int sum(int[] arr) {
        int sum=0;
        for(int x: arr) {
            sum+=x;
        }

        return sum;
    }
}