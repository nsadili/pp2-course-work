import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        var n2 = input.nextInt();

        var sum = n1 + n2;

        System.out.println("Sum: " + sum);
    }
}
