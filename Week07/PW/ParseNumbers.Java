import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers (separated by spaces): ");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+"); // split input string into an array of strings
        int sum = 0;
        boolean hasValidInput = false;

        for (String number : numbers) {
            try {
                int n = Integer.parseInt(number); // parse string to int
                sum += n;
                hasValidInput = true;
            } catch (NumberFormatException e) {
                // ignore non-number input
            }
        }

        if (hasValidInput) {
            System.out.println("Sum of numbers: " + sum);
        } else {
            System.out.println("No valid input provided.");
        }
    }
}