import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println("Sum: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Integer division: " + (a / b));
            System.out.print("Remainder: " + (a % b));
    }
}
