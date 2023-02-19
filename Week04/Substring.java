package Week04;

public class Substring{
    public static void main(String[] args) {
        String string = "This is a test string";
        String sub = "test";
        int index = findSubstring(string, sub);
        if (index == -1) {
            System.out.println("'" + sub + "' is not a substring of '" + string + "'");
        } else {
            System.out.println("'" + sub + "' is a substring of '" + string + "' at index " + index);
        }
    }

    public static int findSubstring(String string, String sub) {
        int index = -1;
        for (int i = 0; i < string.length() - sub.length() + 1; i++) {
            boolean found = true;
            for (int j = 0; j < sub.length(); j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                index = i;
                break;
            }
        }
        return index;
    }
}
