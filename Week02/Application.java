// write a program that takes an integer using comman-line arguments and find the factorial of that number.

import java.util.Scanner;

public class Application { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + num + " is: " + factorial);

        
     
        
    
        
        
    }
}




         

