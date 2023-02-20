import pp2.week03.math.ComplexNumber;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of a complex number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the imaginary part of a complex number: ");
        double y = scanner.nextDouble();

        ComplexNumber c = new ComplexNumber(x, y);

        System.out.print("Enter the power to raise the complex number to: ");
        int n = scanner.nextInt();

        ComplexNumber result = c.pow(n);

        System.out.println("The result of (" + c + ")^" + n + " is: " + result);

        scanner.close();
    }
}
