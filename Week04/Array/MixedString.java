public static String swapFirstAndLast(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
        if (word.length() <= 1) {
            result.append(word).append(" ");
        } else {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            String swapped = last + middle + first;
            result.append(swapped).append(" ");
        }
    }
    return result.toString().trim();
}
