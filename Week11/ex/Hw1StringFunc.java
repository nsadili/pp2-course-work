public interface Hw1StringFunc<T> {
    T reverse(T str);

    public static void main(String[] args) {
        Hw1StringFunc<String> rev = ((String str1) -> {
            String reverse = " ";

            for (int i = str1.length() - 1; i>=0; i--) {
                reverse += str1.charAt(i);
               
            }
            return reverse;
        });

        System.out.println(rev.reverse("Laman"));
    }
}
