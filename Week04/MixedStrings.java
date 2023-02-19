package Week04;
public class MixedStrings {
        public static String swapWords(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String word : words) {
                if(word.length() <= 1) {
                    sb.append(word);
                }
                else {
                    char first = word.charAt(0);
                    char last = word.charAt(word.length() - 1);
                    String middle = word.substring(1, word.length() - 1);
                    sb.append(last).append(middle).append(first);
                }
                sb.append(" ");
            }
            return sb.toString().trim();
        }

        public static void main(String[] args) {
            String sentence = "this is PP2 Fall 2021 :)";
            String mixed = swapWords(sentence);
            System.out.println("original sentence: " + sentence);
            System.out.println("mixed sentence : " + mixed);
        }
    }


