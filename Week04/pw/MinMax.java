import java.util.Arrays;

public class MinMax{

    public static void main(String[] args){

        if(args.length == 0){

            System.out.println("Please enter at least a number");
            System.exit(1);
        }
        System.out.println(Arrays.toString(args));

        int[] elements = new int [args.length];
        for (int i = 0; i < args.length; i++){
            elements[i] = Integer.parseInt(args[i]);
        }
int minimum = calculateMinimum(elements);
int maximum = calculateMaximum(elements);

System.out.println("Minimum: " + minimum);
System.out.println("Maximum: " + maximum);

    }

     public static int calculateMinimum(int[] elements) {
    int min = 1000;

    for (int element : elements) {
        if (element < min) {
            min = element;
        }
    }

    return min;
}

   public static int calculateMaximum(int[] elements) {
    int max = -1000;

    for (int element : elements) {
        if (element > max) {
            max = element;
        }
    }

    return max;
}

}
