package PackageTwo;

import java.util.Scanner;

public class W2Ex1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = x.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = x.nextInt();
        
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        
        x.close();
    }
}
