package Week04;
import java.util.Arrays;

public class CommandLineArguments {

    public static int sumOfElements(String [] args){
        int SumOfElements = 0;
        for (String string : args) {
            SumOfElements = SumOfElements + Integer.parseInt(string);
        }
        return SumOfElements;
    }

    public static double calcAverage(String[] args){
        return (double)sumOfElements(args) / args.length;        
        
    }
    
    public static void main(String[] args) {    
        
        // for (String string : args) {
        //     System.out.println(string);
        // }
        
        System.out.println("Input array: " + Arrays.toString(args));    
        System.out.println("Sum of array elements: " + sumOfElements(args));  
        System.out.println("Average of array elements: " + calcAverage(args));
    }
}
