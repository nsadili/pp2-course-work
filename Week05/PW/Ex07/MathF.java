import java.util.Arrays;

public class MathF{
    
    public int min(int a, int b) {
        // return Math.min(a, b);
        return (a < b) ? a : b;
    }
    
    public int max(int a, int b) {
        // return Math.max(a, b);
        return (a > b) ? a : b;

    }
    
    public int sum(int[] args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        for(int i = 0; i < args.length; i++){

        }
        return sum;
    }
    
    public float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        int sum = sum(args);
        return (float) sum / args.length;
    }
    
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(" undefined for negative numbers");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}



class MathDemoRunner {



public static void main (String[] args) {

    MathF math = new MathF();

    int result1 = math.min(5, 3); // returns 3

    System.out.printf("min(%d, %d) = %d", 5, 3, result1);



    int result2 = math.max(5, 3); // returns 5

    System.out.printf("max(%d, %d) = %d", 5, 3, result2);

    

    int[] nums = {1, 2, 3, 4, 5};

    int result3 = math.sum(nums); // returns 15

    System.out.println("Sum of " + Arrays.toString(nums) + " = " + result3);



    float result4 = math.mean(nums); // returns 3.0

    System.out.println("Mean of " + Arrays.toString(nums) + " = " + result4);



    int result5 = math.factorial(5); // returns 120

    System.out.println("Factorial of 5 = " + result5);

}

}


