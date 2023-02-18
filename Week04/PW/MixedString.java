import java.util.Scanner;

public class MixedString {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println(Swap(input));
    
    }
private static String Swap(String input){
    String[] res = input.split(" ");
    StringBuilder result= new StringBuilder();
    for(String word: res){
        char[]chars = word.toCharArray();
        char temp;
        if(word.length()>1){
    temp = chars[0];
    chars[0]=chars[chars.length-1];
    chars[chars.length-1]= temp;
        }
        result.append(new String(chars)).append(" ");
    }
    return result.toString();
    }

    
}
