package Strings;

public class ex8 {
    public static void main(String args[]) {
    String a = "Azerbaijan";
    System.out.println(explode(a));
    }

    public static StringBuilder explode(String s) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                a.append(s.charAt(i));
            }
        }
        return a;
    }
}
