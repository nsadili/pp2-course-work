public class MixedStrings{
    public static void main(String[] args){
        String sentence = new String("i my name is Islam");
        System.out.println(mixString(sentence));
    }

    static String mixString(String str){
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].length()!=1){
            String tmp = words[i].substring(0, 1);
            words[i] = words[i].charAt(words[i].length()-1) + words[i].substring(1,words[i].length()-1) + tmp;
            }
        }
        str = String.join(" ",words);
        return str;
    }
}