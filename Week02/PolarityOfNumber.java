import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");

        double number = scanner.nextDouble();

        if (number > 0.0) System.out.println("positive");
        else if (number < 0.0) System.out.println("negative");
        else System.out.println("neutral/0");
    }
}
