public class pw3 {
    String exploded(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.substring(0, i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        pw3 se = new pw3();

        System.out.println(se.exploded("Baku"));
        System.out.println(se.exploded("Ganja"));
    }
}
