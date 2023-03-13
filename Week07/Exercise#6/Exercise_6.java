import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter some numbers (or non-number to exit):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
            } else {
                scanner.next(); 
            }
        }

        System.out.println("Sum of numbers: " + sum);
    }
}