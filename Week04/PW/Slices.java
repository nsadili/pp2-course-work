public class Slices {
    public static void Slices(String word) {
        for (int i = 1; i < word.length(); i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        String word = "SITE";
        printSlices(word);
    }
}