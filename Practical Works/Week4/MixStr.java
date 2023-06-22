public class MixStr{
    public static String swap(String sent) {
    String[] words = sent.split(" ");

    StringBuilder res = new StringBuilder();
    for (String str : words) {
        if (str.length() <= 1) {
            res.append(str);
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            res.append(last).append(middle).append(first);
        }

        res.append(" ");
    }
    return res.toString().trim();
}
public static void main(String args[]){
String sentence = "This is PP2 Fall 2021";
System.out.println(swap(sentence)); 
}

}