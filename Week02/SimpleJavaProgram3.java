import java.util.Scanner;

public class SimpleJavaProgram3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number: ");
        int num2 = input.nextInt();
        System.out.println("Enter a number: ");
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Sum is: " + sum);
    }
}


