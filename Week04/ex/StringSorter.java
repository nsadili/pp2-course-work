import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String str = "hello world";
        String sorted = sortString(str);
        System.out.println(sorted);
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
