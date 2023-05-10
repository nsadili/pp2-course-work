public class Slices {
    public static void main(String[] args) {
        String word = "SITE";
        printSlices(word);
    }

    public static void printSlices(String word) {
        for (int i = 1; i < word.length(); i++) {
            String slc1 = word.substring(0, i);
            String slc2 = word.substring(i);
            System.out.println(slc1 + " " + slc2);
        }
        System.out.println(word);
    }
}