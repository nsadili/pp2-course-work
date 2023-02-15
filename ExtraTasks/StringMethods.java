public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        
        int index = str.indexOf("World");
        int index2 = str.lastIndexOf("World");
        String subString = str.substring(6);
        String subString2 = str.substring(0, 5);
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        String replaced = str.replace('o', 'a');
        String[] split = str.split(" ");
        boolean startsWith = str.startsWith("Hello");
    }
}
