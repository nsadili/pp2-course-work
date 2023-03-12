package Week07;

import java.util.ArrayList;
import java.util.List;

public class ParseNumbers {

    /**
     * Parses a comma-separated string of numbers into a list of integers.
     * Non-numeric values are ignored.
     *
     * @param str the comma-separated string of numbers
     * @return the list of integers
     */
    public static List<Integer> parseNumbers(String str) {
        List<Integer> numbers = new ArrayList<>();
        String[] strNumbers = str.split(",");
        for (String s : strNumbers) {
            try {
                int num = Integer.parseInt(s.trim());
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.err.println("(" + s + ")" + " contains non-numeric values which will be ignored.");
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        String str = "";
        List<Integer> numbers = parseNumbers(str);
        System.out.println(numbers);
    }
}
