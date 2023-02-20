public class Slice {
    public static void main(String[] args){

        String word = "SITE";
        printAllSlices(word);

    }

    public static void printAllSlices(String word) {
        int n = word.length();
        for (int i = 1; i < n; i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
        System.out.println(word);
    }
    
}
