import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    String string = sc.nextLine();
    String sub = sc.nextLine();

    System.out.println(SubString(string, sub));

    }



    private static int SubString(String string, String sub) {

        for(int i = 0; i <= string.length() - sub.length(); i++) {
            for(int n=0; i < sub.length(); n++) {

                if(string.charAt(i+n) != sub.charAt(n)) {
                    break;
                }

                if(n == sub.length()-1) {
                    return i;
                }
                
            }
        }
        return -1;
    }
}