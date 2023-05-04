public static String explodeString(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        for (int j = 0; j <= i; j++) {
            sb.append(c);
        }
    }
    return sb.toString();
}
