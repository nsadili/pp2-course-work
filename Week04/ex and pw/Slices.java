public class Slices {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("please enter a word");
            System.exit(1);
        }
        String word = args[0];
        slice(word);
    }

    static void slice(String slice) {
        int len = slice.length();
        String slice1, slice2;
        for (int i = 1; i < len; i++) {
            slice1 = slice.substring(0, i);
            slice2 = slice.substring(i, len);
            System.out.println(slice1 + " " + slice2);

        }
        System.out.println(slice);
    }

}