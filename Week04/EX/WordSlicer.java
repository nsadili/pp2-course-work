public class WordSlicer {
    public static void main(String[] args) {
        String word = "SITE";
        printSlices(word);
    }

    public static void printSlices(String word) {
        for (int i = 1; i < word.length(); i++) {
            String slice = word.substring(0, i) + " " + word.substring(i);
            System.out.println(slice);
        }
        System.out.println(word);
    }
}
