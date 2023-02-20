package pp2.week04;

public class StringReversed {

    public static void main(String[] args) {
        String givenString = "a string to be reversed";
        System.out.println(stringReversed(givenString));
    }

    public static String stringReversed(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
