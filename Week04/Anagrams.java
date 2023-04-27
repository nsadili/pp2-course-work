public static boolean areAnagrams(String s1, String s2) {
    // If the strings are of different lengths, they cannot be anagrams
    if (s1.length() != s2.length()) {
        return false;
    }
    
    // Convert the strings to character arrays
    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();
    
    // Sort the character arrays
    Arrays.sort(s1Array);
    Arrays.sort(s2Array);
    
    // Compare the sorted arrays
    return Arrays.equals(s1Array, s2Array);
}

