public class WordSlicer {
    public static void main(String[] args) {
        String word = "SITE";
        printWordSlices(word);
    }

    public static void printWordSlices(String word) {
        int length = word.length();

        for (int i = 1; i < length; i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            System.out.println(slice1 + " " + slice2);
        }

        System.out.println(word);
    }
}
