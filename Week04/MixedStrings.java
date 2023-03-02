public static String swapFirstAndLast(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
        if (word.length() <= 1) {
            sb.append(word).append(" ");
        } else {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            sb.append(last).append(middle).append(first).append(" ");
        }
    }
    return sb.toString().trim();
}
