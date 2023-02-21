import java.util.Arrays;

public class Anagrams
{
    public static boolean isAnagram(String str1, String str2) 
    {
    // Convert the strings to character arrays and sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    
    // Compare the sorted character arrays
    return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";
        boolean res = isAnagram(str1, str2);
        System.out.println(res); 
    }
}