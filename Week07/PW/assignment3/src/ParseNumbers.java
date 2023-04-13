import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers (separated by spaces): ");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+");
        int sum = 0;
        boolean hasValidInput = false;

        for (String number : numbers) {
            try {
                int n = Integer.parseInt(number);
                sum += n;
                hasValidInput = true;
            } catch (NumberFormatException e) {

            }
        }

        if (hasValidInput) {
            System.out.println("Sum of numbers: " + sum);
        } else {
            System.out.println("No valid input provided.");
        }
    }
}