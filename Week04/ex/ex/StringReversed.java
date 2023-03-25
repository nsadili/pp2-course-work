public class StringReversed {
    
    public static void main(String[] args) {
        String original = "hello world";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }
    
    public static String reverseString(String original) {
        StringBuilder reversed = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        return reversed.toString();
    }
    
}
