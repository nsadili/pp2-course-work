import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.close();

        MathDemo math = new MathDemo();

        int[] arr = new int[args.length];
        int i;
        for(i = 0; i < args.length; i++){
            arr[i] = Integer.parseInt(args[i]);
        }

        System.out.println("minimum of m and n: " + math.min(m, n));
        System.out.println("maximum of m and n: " + math.max(m, n));
        System.out.println("sum of args[]: " + math.sum(arr));
        System.out.println("mean of args[]: " + math.mean(arr));
        System.out.println("factorial of n: " + math.factorial(n));
    }
}
