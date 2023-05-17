public class Stringslice {
    public static void printSlices(String word) {
        int len = word.length();
        for (int i = 1; i < len; i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
    }
    
    public static void main(String [] args){
        printSlices("Slice of words");
        printSlices("World");

    }
    
}
