import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("Substraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Remainder: "+(a%b));

    }
}
