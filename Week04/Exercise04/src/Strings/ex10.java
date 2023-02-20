package Strings;

public class ex10 {
    public static void main(String[] args) {
        String str1 = "Ananin Biliyi";
        String str2 = "Bananin Iliyi";
        System.out.println(anagrams(str1, str2));
    }

    public static boolean anagrams(String s1, String s2) {
        StringBuilder a1 = new StringBuilder(s1.toUpperCase());
        StringBuilder a2 = new StringBuilder(s2.toUpperCase());
        
        int len = a2.length();
        for (int i = 0; i < a1.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < len; j++) {
                if (a1.charAt(i) == a2.charAt(j)) {
                    a2.delete(j, j + 1);
                    len--; cnt++; break;
                }
            }
            if (cnt == 0)
                return false;
        }
        
        return true;
    }
}
