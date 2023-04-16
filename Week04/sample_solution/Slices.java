
class Slice {
    String left;
    String right;

    public Slice(String left, String right) {
        this.left = left;
        this.right = right;
    }

    // @Override
    // public String toString() {
    // return "(" + this.left + "," + this.right + ")";
    // }

    @Override
    public String toString() {
        return this.left + " " + this.right;
    }
}

public class Slices {

    static Slice[] allSlices(String word) {
        Slice[] slices = new Slice[word.length()];

        for (int idx = 0; idx < word.length(); idx++) {
            slices[idx] = new Slice(word.substring(0, idx), word.substring(idx));
        }

        return slices;
    }

    public static void main(String[] args) {

        String str = "SITE";

        // System.out.println(Arrays.toString(allSlices(str)));

        for (Slice sl : allSlices(str)) {
            System.out.println(sl);
        }
    }
}
