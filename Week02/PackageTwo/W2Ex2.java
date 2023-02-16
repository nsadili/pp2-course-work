package PackageTwo;

import java.util.Scanner;

public class W2Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the first integer: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Write the second integer: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        sc.close();

        System.out.println("The sum is: " + (num1 + num2));
        System.out.println("The sub is: " + (num1 - num2));
        System.out.println("The mult is: " + (num1 * num2));
        System.out.println("The divis is: " + (num1 / num2));
        System.out.println("The remaind is: " + (num1 % num2));
    }    
}
