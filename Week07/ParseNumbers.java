package Week07;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String[] numbers = input.split("\\s+");
            int sum = 0;
            
            for (String number : numbers) {
                try {
                    int num = Integer.parseInt(number);
                    sum += num;
                } catch (NumberFormatException ex) {
                    // Ignore non-number input
                }
            }
            
            System.out.println("Sum of numbers: " + sum);
        }
    }
}
