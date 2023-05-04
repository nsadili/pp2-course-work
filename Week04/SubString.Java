public static int findSubstringIndex(String string, String sub) {
    if (string == null || sub == null || string.length() < sub.length()) {
        return -1;
    }

    for (int i = 0; i <= string.length() - sub.length(); i++) {
        boolean match = true;
        for (int j = 0; j < sub.length(); j++) {
            if (string.charAt(i+j) != sub.charAt(j)) {
                match = false;
                break;
            }
        }
        if (match) {
            return i;
        }
    }

    return -1;
}
