public class Slices {
    public static void main(String[] args) {
        Slice("Hello");
    }

    public static void Slice(String str) {
        for (int i = 0; i < str.length(); i++) {
            String slice1 = str.substring(0, i);
            String slice2 = str.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
    }
}
