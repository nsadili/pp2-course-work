import java.util.*;

public class Arrays {
    public static void main(String[] args) {        
        
                        //Get Array
        // int[] num = new int[args.length];
        // for (int i = 0; i < args.length; i++) {
        //     num[i] = Integer.parseInt(args[i]);
        // }
                        //OR

        // int[] num2 = new int[args.length];
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < args.length; i++){
        //     num2[i] = sc.nextInt();
        // }
        
        int[] num = {5, 3 , 3, 2, 2, 1, 4, 5, 1, 2, 10, 9, 9, 2, 2, 3, 4, 8, 7, 6};
        String str = "Exercise Test";

        print.printArrays(num);
        minmax.findMinAndMax(num);
        histogram.findHistogram(num);

        System.out.println(reverse.reverse1(str));
        System.out.println(reverse.reverse2(str));
        System.out.println(reverse.reverse3(str));
        System.out.println(reverse.reverse4(str));

        explode.findExploded(str);

    }

}
    

    
    
    



