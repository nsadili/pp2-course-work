public class Slices {
    public static void toSlices(String str) {
        System.out.println(" " + str);
        for (int i = 1; i < str.length(); i++) {
            String slice1 = str.substring(0, i);
            String slice2 = str.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
        System.out.println(str);
    }
}
