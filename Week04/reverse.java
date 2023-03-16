public class reverse {
    public static String reverse1(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        int l = chars.length;
        for (int i = 0; i < l / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[l - i - 1];
            chars[l - i - 1] = tmp;
        }
        return new String(chars);
    }

    public static String reverse3(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return new String(sb); // == return sb.toString();
    }

    public static String reverse4(String str) {

        return new StringBuilder(str).reverse().toString();
        
    }
}
