package Strings;

public class ex12 {
    public static void main(String args[]) {
        String string = "Azerbaycan";
        String sub = "ay";
        System.out.println(subString(string, sub));
    }

    public static int subString(String str1, String str2) {
        for (int i = 0; i < str1.length() - str2.length(); i++) {
            StringBuilder main = new StringBuilder(str1);
            main.replace(i, i + str2.length(), str2);

            int cnt = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) != main.charAt(j)) {
                    cnt++; break;
                }
            }
            if (cnt == 0) return i;
        }

        return -1;
    }
}
