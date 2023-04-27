public static int countAndPrintCommonSubstrings(String str1, String str2) {
    int count = 0;
    for (int i = 0; i < str1.length(); i++) {
        for (int j = i + 1; j <= str1.length(); j++) {
            String substr = str1.substring(i, j);
            if (str2.contains(substr)) {
                System.out.println(substr);
                count++;
            }
        }
    }
    return count;
}
