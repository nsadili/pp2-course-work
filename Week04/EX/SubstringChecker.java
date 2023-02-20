public class SubstringChecker {
    public static void main(String[] args) {
        String str = "hello world";
        String sub = "world";
        int index = findSubstringIndex(str, sub);
        System.out.println(index);
    }

    public static int findSubstringIndex(String str, String sub) {
        if (str == null || sub == null || sub.length() > str.length()) {
            return -1;
        }

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                return i;
            }
        }

        return -1;
    }
}
