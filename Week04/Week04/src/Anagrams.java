import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String m = scan.nextLine();
        System.out.println("Are these string anagrams :" + Anagrams(s, m));
    }

    public static boolean Anagrams(String s, String m){
        String f = new String(sort(s));
        String h = new String(sort(m));
        if(f.equals(h)){
            return true;
        }else{
            return false;
        }

    }

    public static String sort(String s){
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            for(int j = i + 1; j < chars.length; j++){
                if(chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        for(int m = 0; m < chars.length; m++) {
            sb.append(chars[m]);
        }
        return sb.toString();
    }
}
