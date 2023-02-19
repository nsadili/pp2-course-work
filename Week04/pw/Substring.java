public class Substring {
    public static int findSubstring(String string, String sub) {
        int n = string.length();
        int m = sub.length();
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
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
        System.out.println(findSubstring(string, sub)); // 6
    }
}
