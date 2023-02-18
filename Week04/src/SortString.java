import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "bacedf";
        System.out.println(sortString(str));
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
