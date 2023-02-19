public class Slices {
    public static void printSlices(String word) {
        int n = word.length();
        for (int i = 1; i < n; i++) {
            String slice = word.substring(0, i) + " " + word.substring(i);
            System.out.println(slice);
        }
        System.out.println(word);
    }

    public static void main(String[] args){
        Slices.printSlices("SITE");
    }
}
