import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        
        System.out.println(areAnagrams("salam", "malas")); 
        
    }

    public static boolean areAnagrams(String String1, String String2) {
        if (String1.length() != String2.length()) {
            return false;
        }
    
        char[] str1 = String1.toCharArray();
        char[] str2 = String2.toCharArray();
    
        Arrays.sort(str1);
        Arrays.sort(str2);
    
        return Arrays.equals(str1, str2);
    }
    

}