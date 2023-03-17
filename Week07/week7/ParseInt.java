package pp2.week7;

public class ParseInt {
    private ParseInt() {
    }

    public static int parseInt(String str) throws NumberFormatException {
        if (str == null) {
            throw new NumberFormatException("Cannot parse null value");
        }
        int result = 0;
        boolean negative = false;
        int i = 0;
        int len = str.length();
        if (len > 0) {
            char firstChar = str.charAt(0);
            if (firstChar == '-') {
                negative = true;
                i++;
            } else if (firstChar == '+') {
                i++;
            }
            while (i < len) {
                char ch = str.charAt(i++);
                if (ch >= '0' && ch <= '9') {
                    int digit = ch - '0';
                    result = result * 10 + digit;
                } else {
                    throw new NumberFormatException("Cannot parse character");
                }
            }
        } else {
            throw new NumberFormatException("Cannot parse empty string");
        }
        return negative ? -result : result;
    }

}
