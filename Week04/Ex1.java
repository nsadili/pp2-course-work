import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.out.println("Please, enter at least a number");
            System.exit(1);
        }

        System.out.println(Arrays.toString(args));
        
        int[] num = new int[args.length];
        for( int i = 0; i < args.length - 1; i++) {
            num[i] = Integer.parseInt(args[i]);
        }
        printArr(num);
        System.out.println(sum(num));
    }

    private static void printArr(int[] arr) {

        for(int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

    }

    private static int sum(int[] arr) {
        var sum = 0;
        for(var el : arr) 
            sum += el;

            return sum;
    }
}