public class Substring{
    public static int findSub(String str, String sub) {
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == sub.charAt(0)) {
            boolean match = true;
            for (int j = 1; j < sub.length(); j++) {
                if (i + j >= str.length() || str.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
    }
    return -1;
}

public static void main(String args[]){
    String str = "hello world";
    String sub = "world";
    System.out.println(findSub(str, sub));
}
}