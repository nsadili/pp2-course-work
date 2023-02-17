package pp2.week4;

public class Ex13 {
    public static void printSlices(String word) {
        int len = word.length();
        for (int i = 1; i < len; i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
        System.out.println(word);
    }
}
