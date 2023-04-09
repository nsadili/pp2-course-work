public class Slices {
    public static void printSlices(String word) {

        for (int i = 0; i < word.length(); i++) {

            String firstPart = word.substring(0, i);

            String secondPart = word.substring(i);

            System.out.println(firstPart + " " + secondPart);
        }
    }

    public static void main(String[] args) {
        printSlices("SITE");
    }
}