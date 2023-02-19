public class Substring {
    
    public static void main(String[] args) {
        String string = "Neftchala";
        String sub = "u";
        substringIndex(string, sub);
    }
    
    private static void substringIndex(String s1, String s2) {
        int i = s1.indexOf(s2);
        if (i != -1) System.out.printf("Substring Index: %d\n", i); else System.out.println("-1");
    }
}