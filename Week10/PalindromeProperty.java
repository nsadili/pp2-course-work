public class PalindromeProperty implements Property<String> {

    public boolean test(String obj) {

        StringBuilder reverse = new StringBuilder();

        for (int i = obj.length() - 1; i >= 0; i--) {
            reverse.append(obj.charAt(i));
        }

        return obj.equals(reverse.toString());

    }

}
