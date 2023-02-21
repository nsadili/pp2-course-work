
public class Mixedst {
    public static String mixWords(String sentence) {
        String[] words = sentence.split("\\s");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                word = lastChar + word.substring(1, word.length() - 1) + firstChar;
                words[i] = word;
            }
        }
        String newSentence = String.join(" ", words);
        return newSentence;
    }

    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";
        String newSentence = mixWords(sentence);
        System.out.println(newSentence);
    }
}


    
    
    

