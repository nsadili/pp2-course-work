import java.util.Arrays;

public class StringSorter {

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "bcdahefgij";
        String sorted = sortString(input);
        System.out.println("Input string: " + input);
        System.out.println("Sorted string: " + sorted);
    }
}
