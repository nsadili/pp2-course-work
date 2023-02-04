import java.lang.Math;
import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter first num: ");
        int firstNumber = scanner.nextInt();
        
        System.out.println("Enter an operation (+, -, *, /):");
        char symbol = scanner.next().charAt(0);
        
        
        System.out.println("enter second num: ");
        int secondNumber = scanner.nextInt();
        
        
        

        if (symbol == '+'){
            System.out.println("Result is: "+ (firstNumber + secondNumber));
        }

        if (symbol == '-'){
            System.out.println("Result is: "+ (firstNumber - secondNumber));
        }

        if (symbol == '*'){
            System.out.println("Result is: "+ (firstNumber * secondNumber));
        }

        if (symbol == '/'){
            System.out.println("Result is: "+ (firstNumber / secondNumber));
        }
        
        
        
    }
}