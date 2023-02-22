import java.util.Scanner;

public class Substring {
    static int isSubstring(String str, String sub){
        boolean x;
        for(int i = 0; i < str.length() - sub.length(); i++){
            x = true;
            for(int j = 0; j < sub.length(); j++){
                if(str.charAt(i + j) != sub.charAt(j)){
                    x = false;
                    break;
                }
            }
            if(x) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String sub = input.nextLine();
        input.close();
        
        System.out.println(isSubstring(str, sub));

    }
}
