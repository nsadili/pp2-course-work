package Week04.Array;

public class SubstringFinder {
    public static int findSubstringIndex(String string, String sub) {
        int n = string.length();
        int m = sub.length();

        // If the length of sub is greater than string, it can't be a substring.
        if (n < m) {
            return -1;
        }

        // Loop through string to find the sub.
        for (int i = 0; i <= n - m; i++) {
            boolean isSubstring = true;

            // Check if sub is a substring of string starting from index i.
            for (int j = 0; j < m; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    isSubstring = false;
                    break;
                }
            }

            // If sub is a substring of string, return the index of the start of sub in string.
            if (isSubstring) {
                return i;
            }
        }

        // If sub is not a substring of string, return -1.
        return -1;
    }

    public static void main(String[] args) {
        String string = "hello world";
        String sub = "world";

        int index = findSubstringIndex(string, sub);

        if (index != -1) {
            System.out.println("Substring found at index " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}
