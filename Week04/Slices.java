package Week04;

public class Slices {
    public static void printSlices(String word) {
        if (word == null) {
            return;
        }
        int len = word.length();
        for (int i = 1; i < len; i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
        System.out.println(word);
    }
    public static void main(String[] args) {
        String word = "SITE";
        printSlices(word);
    }
    
}
