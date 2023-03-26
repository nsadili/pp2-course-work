class Slice {
    String left;
    String right;

    public Slice(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return this.left + " " + this.right;
    }
}

public class Slices {
    private String word;

    public Slices(String word) {
        this.word = word;
    }

    public Slice[] allSlices() {
        Slice[] slices = new Slice[word.length()];

        for (int idx = 0; idx < word.length(); idx++) {
            slices[idx] = new Slice(word.substring(0, idx), word.substring(idx));
        }

        return slices;
    }

    public static void main(String[] args) {
        Slices slices = new Slices("SITE");

        for (Slice sl : slices.allSlices()) {
            System.out.println(sl);
        }
    }
}
