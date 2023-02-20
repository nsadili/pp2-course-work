public class SortingStrings {
    public static String sortStringAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {gi
        String str = "Asgar Huseynli;
        String sortedStr = sortAlphabetManner(str);
        System.out.println(sortedStr);
    }
}




