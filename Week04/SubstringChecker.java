public class SubstringChecker {
    public static void main(String[] args) {
        String string = "Hello, world!";
        String sub = "world";

        int index = findSubstringIndex(string, sub);
        System.out.println("Substring index: " + index);
    }

    public static int findSubstringIndex(String string, String sub) {
        int stringLength = string.length();
        int subLength = sub.length();

        for (int i = 0; i <= stringLength - subLength; i++) {
            boolean isSubstring = true;

            for (int j = 0; j < subLength; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    isSubstring = false;
                    break;
                }
            }

            if (isSubstring) {
                return i;
            }
        }

        return -1;
    }
}
