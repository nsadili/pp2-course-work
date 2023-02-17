import java.util.Arrays;

import javax.swing.ImageIcon;

public class Ex1 {
    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.out.println("Please, enter at least a number");
            System.exit(1);
        }

        System.out.println(Arrays.toString(args));
        
        int[] num = new int[args.length];
        // Integer.parseInt(args);
        for( int i = 0; i < args.length - 1; i++) { // intex stars from thereby, write - 1
            num[i] = Integer.parseInt(args[i]);
        }

        //System.out.println(Arrays.toString(num));
        printArr(num);
        System.out.println(sum(num));


    
    }

    //defauld can be accessed from packages
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