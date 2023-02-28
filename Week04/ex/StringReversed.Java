public class StringReversed {
    public static void main(String[] args) {
        // given a string
        String inputStr = "Hello World!";
        System.out.println("Input String: " + inputStr);
        
        // reverse it
        String reversedStr = reverseString(inputStr);
        System.out.println("Reversed String: " + reversedStr);
    }

    // method to take a single parameter of type String and return its reverse
    public static String reverseString(String str) {
        // consider using StringBuilder while generating the reversed string
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
} 