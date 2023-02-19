public class Substring {
   //a
    public static boolean isSubstring(String string, String sub) {
        int len1 = string.length();
        int len2 = sub.length();
     
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
     
            for (j = 0; j < len2; j++) {
                if (string.charAt(i + j) != sub.charAt(j))
                    break;
            }
     
            if (j == len2)
                return true;
        }
     
        return false;
    }
    //b
    public static int findSubstringIndex(String string, String sub) {
        int len1 = string.length();
        int len2 = sub.length();
     
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
     
            for (j = 0; j < len2; j++) {
                if (string.charAt(i + j) != sub.charAt(j))
                    break;
            }
     
            if (j == len2)
                return i;
        }
     
        return -1;
    }
    
    
}
