import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseNumbers {

    public static ArrayList<Integer> extractNumbers(String input) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string containing numbers and other characters:");
        String input = scanner.nextLine();

        ArrayList<Integer> numbers = extractNumbers(input);

        if (!numbers.isEmpty()) {
            System.out.println("Extracted numbers:");
            for (Integer number : numbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("No valid input provided.");
        }
    }
}
