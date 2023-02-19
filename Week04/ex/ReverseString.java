package Week04.ex;

public class ReverseString {
    public static void main(String[] args) {
    String originalString = "String to be reversed";
    System.out.println("Original string: " + originalString);

        String reversedString = reverse(originalString);
        System.out.println("Reversed string: " + reversedString);
        
        String str = "Java is object-oriented";
        String reverseStr = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseStr);
    }
    
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            int otherEnd = sb.length() - 1 - i;
            sb.setCharAt(i, sb.charAt(otherEnd));
            sb.setCharAt(otherEnd, temp);
        }
        return sb.toString();
    }
    
}

