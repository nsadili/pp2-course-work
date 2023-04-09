import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {

        String inputStr = "Hello World!";
        System.out.println("Input String: " + inputStr);

        String sortedStr = sortString(inputStr);
        System.out.println("Sorted String: " + sortedStr);
    }

    public static String sortString(String str) {

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}