import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(reverse2(word));   
    }

    static String reverse1(String str){
        String res = "";
        for(int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
    } 
    static String reverse2(String str){
        char[] chars = str.toCharArray();
        var leng = chars.length;
        for(int i = 0; i < chars.length / 2; i++){
            char temp = chars[i];
            chars[i] = chars[leng - 1 - i];
            chars[leng - 1 - i] = temp;

        }
        return new String(chars);
    }
    


    
}
