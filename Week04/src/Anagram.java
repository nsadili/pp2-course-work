import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "olleh"));
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char [] str1Arr = str1.toCharArray();
        char [] str2Arr = str2.toCharArray();
        
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        if(Arrays.equals(str1Arr, str2Arr)) {
            return true;
        } else {
            return false;
        }
    }
}
