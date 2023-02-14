//package taghi_mammadov.week_02;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input first number: ");
              int num1 = in.nextInt();
               
              System.out.print("Input second number: ");
              int num2 = in.nextInt();
               
             
              System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
               
              System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
               
              System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
               
              System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
             
              System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        }
    }
}
