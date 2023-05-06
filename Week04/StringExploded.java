public class StringExploded {
    String exploded(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.substring(0, i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringExploded se = new StringExploded();

        System.out.println(se.exploded("Baku"));
        System.out.println(se.exploded("Khojali"));
    }
}
