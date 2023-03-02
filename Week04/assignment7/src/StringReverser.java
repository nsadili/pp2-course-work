public class StringReverser {

    public static String reverseString(String inputString) {
        StringBuilder sb = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            sb.append(inputString.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String inputString = "This sentence will be reversed.";
        String reversedString = reverseString(inputString);
        System.out.println("Input String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}
