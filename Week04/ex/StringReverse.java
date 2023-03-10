public class StringReverse {
    String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--)
        sb.append(str.charAt(i));
       return sb.toString();
    }
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();

        System.out.println(sr.reverse("Hello"));
        System.out.println(sr.reverse("I love Java"));

    }

}