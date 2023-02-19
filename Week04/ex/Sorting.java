public static String sortString(String input) {
    char[] charArray = input.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
}