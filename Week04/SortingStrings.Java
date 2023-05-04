public static String sortString(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
}
