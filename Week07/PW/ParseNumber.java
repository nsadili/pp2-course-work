package PW;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter another number: ");
        String input2 = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            int sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        } catch (NumberFormatException ex) {
            System.err.println("Error: Input must contain only numbers");
        }
    }
}