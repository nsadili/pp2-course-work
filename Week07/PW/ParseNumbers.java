import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with numbers: ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("No valid input was provided.");
            return;
        }

        int sum = 0;
        String[] parts = input.split("\\s+");
        for (String part : parts) {
            try {
                int number = Integer.parseInt(part);
                sum += number;
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("Sum of numbers in the input: " + sum);
    }
}
