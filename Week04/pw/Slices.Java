public class Slices {
    public static void printSlices(String word) {
        // Iterate through each index of the word
        for (int i = 0; i < word.length(); i++) {
            // Create a substring containing the first part of the word
            String firstPart = word.substring(0, i);
            // Create a substring containing the second part of the word
            String secondPart = word.substring(i);
            // Print out both parts
            System.out.println(firstPart + " " + secondPart);
        }
    }
 
    public static void main(String[] args) {
        printSlices("SITE");
    }
}