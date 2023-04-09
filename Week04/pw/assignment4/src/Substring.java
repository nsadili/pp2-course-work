public class Substring {
    public static int findSubstring(String string, String sub) {

        if (string.length() < sub.length()) {
            return -1;
        }

        for (int i = 0; i <= string.length() - sub.length(); i++) {

            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
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

    public static void main(String[] args) {
        System.out.println(findSubstring("This is PP2 Fall 2021", "PP2"));
    }
}