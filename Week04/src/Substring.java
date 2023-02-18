public class Substring {
    public static void main(String[] args) {
        String str = "hello world";
        String sub = "rld";
        System.out.println(isSubstring(str, sub));
    }
    public static int isSubstring(String str, String sub) {
        int index = str.indexOf(sub);
        return (index == -1) ? -1 : index;
    }
}
