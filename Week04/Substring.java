public static int findSubstring(String string, String sub) {
    int n = string.length();
    int m = sub.length();
    
    // Iterate through the string
    for (int i = 0; i <= n - m; i++) {
        boolean match = true;
        // Check if substring matches at this position
        for (int j = 0; j < m; j++) {
            if (string.charAt(i + j) != sub.charAt(j)) {
                match = false;
                break;
            }
        }
        if (match) {
            // Found a match, return index
            return i;
        }
    }
    // Substring not found
    return -1;
}

