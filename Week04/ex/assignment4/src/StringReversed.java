public class StringReversed {
    public static void main(String[] args) {

        String inputStr = "Hello World!";
        System.out.println("Input String: " + inputStr);

        String reversedStr = reverseString(inputStr);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) {

        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
}