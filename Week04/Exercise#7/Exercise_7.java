public class Exercise_7 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}