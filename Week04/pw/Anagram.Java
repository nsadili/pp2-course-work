public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        // Remove all whitespace and convert strings to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();
 
        // Edge case check: If the lengths of the strings are not the same, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
 
        // Create array to store occurrence of each letter; initialize each index to 0
        int[] letters = new int[256];
        for (int i = 0; i < 256; i++) {
            letters[i] = 0;
        }
 
        // Iterate through the first string, and add 1 to the corresponding index in the array
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }
 
        // Iterate through the second string,
        // and subtract 1 from the corresponding index in the array
        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i)]--;
        }
 
        // Check that all indices in the array are 0
        for (int i = 0; i < 256; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
 
        return true;
    }
 
    public static void main(String[] args) {
        System.out.println(isAnagram("ref", "fere"));
    }
}