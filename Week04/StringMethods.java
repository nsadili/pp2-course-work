public class StringMethods {
    public static void main(String[]args){
        String str = "Programming";

        System.out.println("String length: " + str.length());
        System.out.println("Equals 1: " + str.equals("programming"));
        System.out.println("Equals 2: " + str.equals("Programming"));
        System.out.println("The 4th character: " + str.charAt(4));
        System.out.println("Compare to: " + str.compareTo("Programming"));
        System.out.println("Index of 'gram': " + str.indexOf("gram"));
        System.out.println("Substring: " + str.substring(3, 6));
        System.out.println("Concatenation: " + str.concat(" Principle"));
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("Replace: " + str.replace("r", "l"));
    }
}
