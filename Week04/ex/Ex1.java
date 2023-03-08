import java.util.Arrays;

public class Ex1 {
    public static void main(String [] args) {
        if(args.length < 2) {
            System.out.println("Please provide, two numbers!");
            System.exit(1);
        }
        int num[] = new int[args.length];
        for(int i=0; i<args.length; i++) {
        num[i] = Integer.parseInt(args[i]); // here we convert to integer
    }

    printArray(num);
    System.out.println(sum(num));
}
    private static void printArray(int[] arr) {
        for (var el : arr) {
            System.out.println(el + " "); //What is that mean?
        }

        System.out.println();

    }
    private static int sum(int[] arr) {
        var sum = 0;
        for (var el : arr) {
        sum += el;
    }
        return sum;
    }
}


