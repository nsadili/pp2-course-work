public class Substring {
    public static int findSubstringIndex(String string, String sub) {
        int string_length = string.length();
        int sub_length = sub.length();
        int max = stringLength - subLength;

        for (int i = 0; i <= max; i++) {
            if (string.substring(i, i + sub_length).equals(sub)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String string = "Asgar Huseynli;
        String sub = "Huseynli;
        int index = findSubstringIndex(string, sub);
        System.out.println(index);
    }
}