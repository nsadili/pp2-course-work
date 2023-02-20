package Strings;

public class ex7 {
    public static void main(String args[]) {
        String s = "Salam Emleyke";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
        }
        return a;
    }
}
