
//package taghi_mammadov.week_02;
import java.util.Scanner;
public class Digits {
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input first integer: ");
            int firstInt = in.nextInt();
            System.out.print("Input second integer: ");
            int secondInt = in.nextInt();

            System.out.printf("Sum: %d%n", firstInt + secondInt);
            System.out.printf("Product: %d%n", firstInt * secondInt);
            System.out.printf("Average: %.2f%n", (double) (firstInt + secondInt) / 2);
           
        }
    }
    
}
