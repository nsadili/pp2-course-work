public static int findSubstringIndex(String string, String sub) {
    for (int i = 0; i <= string.length() - sub.length(); i++) {
        boolean found = true;
        for (int j = 0; j < sub.length(); j++) {
            if (string.charAt(i+j) != sub.charAt(j)) {
                found = false;
                break;
            }
        }
        if (found) {
            return i;
        }
    }
    return -1;
}
