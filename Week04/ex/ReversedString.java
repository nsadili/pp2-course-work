public class ReversedString {

    public static void main(String[] args) {
        String str = "Asgar Huseynli";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder obj = new StringBuilder();
        for (int i = obj.length() - 1; i >= 0; i--) {
            obj.append(str.charAt(i));
        }
        return obj.toString();
    }
}