package Week7;

public class ParseNumbers {
    public static void main(String[] args) {
        String input = "123 45 6a7 89b 10";
        int sum = 0;

        String[] numbers = input.split("\\s+"); 
        for (String number : numbers) {
            try {
                int parsedNumber = Integer.parseInt(number);
                sum += parsedNumber;
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
