import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
        String original = "hello world";
        String sorted = sortString(original);
        System.out.println(sorted);
    }
    
    public static String sortString(String original) {
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
}
