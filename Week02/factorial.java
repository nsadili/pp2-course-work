import java.util.Arrays;
import java.util.Scanner;
// import java.util.Random

public class code{

    public static void main(String[] args) { 
        int result  = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Negative numbers do not have factorial");
            return;
        }
        else {
            
            for (int i = 1; i <= number; i++) {
            result *= i;
            }
            
        }
        System.out.println("Factorial of " + number +" is " + result);
    }
}

