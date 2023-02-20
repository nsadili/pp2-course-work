package Strings;

public class ex13 {
    public static void main(String args[]) {
        String str = "Xurma";
        slices(str);
    }

    public static void slices(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, s.length() - i) + " "
            + s.substring(s.length() - i, s.length()));
        }
    }
}
