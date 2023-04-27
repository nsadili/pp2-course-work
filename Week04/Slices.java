public static void printSlices(String word) {
    int n = word.length();
    for (int i = 1; i < n; i++) {
        String slice1 = word.substring(0, i);
        String slice2 = word.substring(i, n);
        System.out.println(slice1 + " " + slice2);
    }
}
