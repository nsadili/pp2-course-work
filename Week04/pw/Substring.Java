public class Substring {
    public static int findSubstring(String string, String sub) {
        // Edge case check: If the lengths of the strings are not the same, they cannot be anagrams
        if (string.length() < sub.length()) {
            return -1;
        }
 
        // Iterate through the first string, and check if the substring is found
        for (int i = 0; i <= string.length() - sub.length(); i++) {
            // Compare the characters in both strings
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
 
            // If all characters match, return the index of the first character of the substring
            if (found) {
                return i;
            }
        }
 
        return -1;
    }
 
    public static void main(String[] args) {
        System.out.println(findSubstring("This is PP2 Fall 2021", "PP2"));
    }
}