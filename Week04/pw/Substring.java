public class Substring {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String sub = "wor";
        int index = findSubstringIndex(s, sub);
        if (index != -1) {
            System.out.println(sub + " is a substring of " + s + " at index " + index);
        } else {
            System.out.println(sub + " is not a substring of " + s);
        }
    }

    public static int findSubstringIndex(String s, String sub) {
        if (sub.length() > s.length()) {
            return -1;
        }

        for (int i = 0; i <= s.length() - sub.length(); i++) {
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (s.charAt(i + j) != sub.charAt(j)) {
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
}
