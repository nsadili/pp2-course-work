public class SubstringFinder {
    
    public static boolean isSubstring(String string, String sub) {
        for (int i = 0; i <= string.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                return true;
            }
        }
        return false;
    }

    public static int findSubstringIndex(String string, String sub) {
        for (int i = 0; i <= string.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String string = "Hello world";
        String sub = "ol";
        if (isSubstring(string, sub)) {
            System.out.println(sub + " is a substring of " + string);
            System.out.println("Index of " + sub + " in " + string + " is " + findSubstringIndex(string, sub));
        } else {
            System.out.println(sub + " is not a substring of " + string);
        }
    }
}