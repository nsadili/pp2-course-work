import java.util.Arrays; 

public class StringSorting {
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "hello";
        String sortedStr = sortString(str);
        System.out.println(sortedStr);
    }
    public static String String(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}