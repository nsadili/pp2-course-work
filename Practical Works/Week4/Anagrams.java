import java.util.Arrays;

public class Anagrams{
    public static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }

    char[] s1Arr = str1.toCharArray();
    char[] s2Arr = str2.toCharArray();

    Arrays.sort(s1Arr);
    Arrays.sort(s2Arr);
    return Arrays.equals(s1Arr, s2Arr);
}
public static void main(String args[]){
    String str1 = "listen";
    String str2 = "silent";
    System.out.println(areAnagrams(str1, str2));

}
}