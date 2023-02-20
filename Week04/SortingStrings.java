package pp2.week04;

public class SortingStrings {

    public static void main(String[] args) {

        String str = "rovshan";
        System.out.println(sortString(str));

        /** i = 0
         * r vs o -> orvshan
         * o vs v -> orvshan
         * o vs s -> orvshan
         * o vs h -> hrvsoan
         * h vs a -> arvsohn
         * a vs n -> arvsohn
         *
         * i = 1
         */
    }

    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }
}
