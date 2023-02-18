import java.util.Arrays;

public class Ex1{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please, enter a value");
            System.exit(1);
        }
        System.out.println(Arrays.toString(args));
        int[]numbers = new int[args.length];
        for(int i = 0; i < args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
       printArray(numbers);
       System.out.println(sum(numbers));
    }
    private static void printArray(int[] arr){
        for(int element : arr){
            System.out.println(element + " ");
        }
        System.out.println();
    }
    private static int sum(int[] arr){
        var sum = 0;
        for(var element : arr){
            sum += element;
        }
        return sum;
    
    }
}