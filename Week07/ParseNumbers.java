package Week07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParseNumbers {
    private static int number;
    private static double floatingPointNumber;
    private static int stringNumber;
    private static double stringFloatingPointNumber;

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatched");
            } catch (NumberFormatException e) {
                System.out.println("Number Format is invalid for this input");
            }
        }

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a floating point number: ");
                floatingPointNumber = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatched");
            } catch (NumberFormatException e) {
                System.out.println("Number Format is invalid for this input");
            }
        }

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string representation of an integer: ");
                stringNumber = Integer.parseInt(scanner.next());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatched");
            } catch (NumberFormatException e) {
                System.out.println("Number Format is invalid for this input");
            }
        }

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string representation of a floating point number: ");
                stringFloatingPointNumber = Double.parseDouble(scanner.next());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatched");
            } catch (NumberFormatException e) {
                System.out.println("Number Format is invalid for this input");
            }
        }

        System.out.println("Number: " + number);
        System.out.println("Floating point number: " + floatingPointNumber);
        System.out.println("String representation of an integer: " + stringNumber);
        System.out.println("String representation of a floating point number: " + stringFloatingPointNumber);
    }
}
