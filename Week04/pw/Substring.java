public class Substring {
    public static boolean isSubstring(String string, String sub) {
        int n = string.length();
        int m = sub.length();
    
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
    
        return false;
    }
    public static void findSubstringIndex(String string, String sub) {
        int n = string.length();
        int m = sub.length();
    
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println(i);
                return;
            }
        }
    
        System.out.println("-1");
    }
}
