import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter a number: ");
        int b = input.nextInt();
       
        System.out.println("Sum: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b));
        System.out.println("Remainder of the division: " + (a % b));
    }
}
