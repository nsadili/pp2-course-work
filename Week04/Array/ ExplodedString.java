public static String explodedString(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        sb.append("B").append(c);
    }
    return sb.toString();
}

