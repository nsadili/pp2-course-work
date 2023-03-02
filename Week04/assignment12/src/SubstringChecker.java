public class SubstringChecker {

    public static int checkSubstring(String string, String sub) {

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
        String string = "PP2 Course";
        String sub = "Course";
        int index = checkSubstring(string, sub);
        if (index == -1) {
            System.out.println("Substring not found");
        } else {
            System.out.println("Substring found at index: " + index);
        }
    }
}
