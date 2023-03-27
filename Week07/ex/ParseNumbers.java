import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers separated by spaces:");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        int sum = 0;
        int count = 0;
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
            }
        }

        if (count > 0) {
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Average of numbers: " + ((double) sum / count));
        } else {
            System.out.println("No valid input provided.");
        }
    }
}
