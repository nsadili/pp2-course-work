import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        if(args.length ==0) {
            System.out.println("Please, enter at least a number");
            System.exit(1);
        }
        System.out.println(Arrays.toString(args));
        int nums[] = new int[args.length];
        for(int i = 0; i < args.length - 1; i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        printArr(nums);
        sum(nums);
         
    }
   private static void printArr(int[] arr){
        for (int el : arr) {
            System.out.println(el+"");
        }
        System.out.println();
    }  

    static int sum(int[] arr){
        var sum = 0;
        for(var el : arr)
        sum += el;
        return sum;
    } 

}
