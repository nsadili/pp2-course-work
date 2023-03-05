public class MixedString {
    public static String swapFirstAndLast(String str) {
        String[] chr = str.split(" ");
        StringBuilder chr1 = new StringBuilder();
    
        for (int i = 0; i < chr.length; i++) {
            String word = chr[i];
            if (word.length() == 1) {
                chr1.append(word);
            } else {
                char first = word.charAt(0);
                String middle = word.substring(1, word.length() - 1);//substring is used for taking middle part(from 1 to word.length() -1)
                char last = word.charAt(word.length() - 1);
                String newWord = last + middle + first;
                chr1.append(newWord);
            }
            if (i < chr.length - 1) {
                chr1.append(" ");
            }
        }
    
        return chr1.toString();
    }
}
