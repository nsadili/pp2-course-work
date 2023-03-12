import java.util.Scanner;

public class ParseNumbers {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sequence of numbers separated by commas: ");
            String input = sc.nextLine();

            String[] numbers = input.split(",");

            int sum = 0;
            for (String number : numbers) {
                try {
                    int n = Integer.parseInt(number);
                    sum += n;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            System.out.println("The sum of the numbers is: " + sum);
        }
    }
}