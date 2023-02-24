package MathDemoPw7;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int min = MathDemo.Min(10, 15);
        int max = MathDemo.Max(10, 15);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int[] inputs = {1, 2, 3, 4, 5};
        int sum = MathDemo.Sum(inputs);
        System.out.println("Sum = " + sum);
        int fact = MathDemo.factorial(5);
        System.out.println("fact = " + fact);
        int[] inputs1 = {1, 2, 3, 4, 5};
        int mean = MathDemo.Mean(inputs1);   
        System.out.println("Mean = " + mean);
     }
}
