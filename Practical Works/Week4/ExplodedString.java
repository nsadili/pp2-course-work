public class ExplodedString{
public static String explode(String input) {
    StringBuilder word = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
        word.append(input.charAt(i));
        if (i != input.length() - 1) {
            word.append(input.charAt(i));
        }
    }
    return word.toString();
}
public static void main(String[] args){

    String input = "Baku";
    System.out.println(explode(input));

}
}