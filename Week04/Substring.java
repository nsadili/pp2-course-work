public class Substring {
    public static int substringIndex(String str, String sub) {
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
