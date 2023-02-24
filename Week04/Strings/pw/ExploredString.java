package Week04.Strings.pw;

public class ExploredString {
    String exploded(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.substring(0, i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ExploredString se = new ExploredString();

        System.out.println(se.exploded("Baku"));
        System.out.println(se.exploded("Khojali"));
    }
}
