package EX;
import java.util.Arrays;

public class ex1pw2 {
    // main
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Please, print a value.");
            System.exit(1);
        }

        System.out.println(Arrays.toString(args));

        int numbers[] = new int[args.length];
        for (int i = 0; i < args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
      
        printArray(numbers);
        sum(numbers);
        returnMax(numbers);
        returnMin(numbers);
    }

    // classes
    public class minMax {
        int min;
        int max;

        public minMax(int min, int max){
            setMax(max);
            setMin(min);
        }

        public void setMin(int min) {
            this.min = min;
        }

        public void setMax(int max) {
            this.max = max;
        }
        
    }

    // methods
    static void printArray(int[] arr){
        for (int el: arr){
            System.out.println(el + " ");
        }
    }

    private static int sum(int[] arr){
        var sum = 0;
        for (var el: arr){
            sum += el;
        }
        return sum;
    }

    public static int returnMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int returnMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public minMax returnMaxAndMin(int[] arr){
        return new minMax(returnMin(arr), returnMax(arr));
    }
}