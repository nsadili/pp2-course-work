public class SortingStrings {
    public static void main(String[] args) {
        // given a string
        String inputStr = "Hello World!";
        System.out.println("Input String: " + inputStr);
        
        // sort its letters in an alphabetical order
        String sortedStr = sortString(inputStr);
        System.out.println("Sorted String: " + sortedStr);
    }

    // method to take a string and return the “sorted” string
    public static String sortString(String str) {
        // convert string to char array
        char[] chars = str.toCharArray();
        // sort the char array
        Arrays.sort(chars);
        // return the sorted string
        return new String(chars);
    }
}