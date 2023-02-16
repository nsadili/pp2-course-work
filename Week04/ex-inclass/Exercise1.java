import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please, enter at least an integer.");
            System.exit(1);
        }

        int numbers[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
             numbers[i] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(numbers));

        printArr(numbers);
        System.out.println(sumArr(numbers));
        System.out.println(averageArr(numbers));
    }


    private static void printArr(int[] arr) {
        for (var el : arr)
        System.out.print(el + " ");
        System.out.println();
    }

   private static int sumArr(int[] arr) {

    var sum = 0;
    for (var el : arr)  
    sum += el;

    return sum;

    }

    private static double averageArr(int[] arr) {

        var sum = 0;
        var cnt = 0;

        for (var el : arr) {
        sum += el;
        cnt++;
        }

        return sum / cnt;
    }
}