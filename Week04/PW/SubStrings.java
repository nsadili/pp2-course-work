public class SubStrings{
    public static int findSubstringIndex(String string, String sub) {
        if (sub.length() > string.length()) {
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
    
    public static void main(String[] args) {
        String string = "hello world";
        String sub = "wor";
        int index = findSubstringIndex(string, sub);
        if (index >= 0) {
            System.out.println("Substring found at index " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}
