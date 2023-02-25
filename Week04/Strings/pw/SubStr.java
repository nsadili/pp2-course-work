package Week04.Strings.pw;
import java.util.Scanner;
public class SubStr {
    public static boolean isSubstring(String a, String sub) {
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i) == sub.charAt(0)) {
                for(int j = i + 1; j < a.length(); j++) {
                    if(a.substring(i,j).equals(sub)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String sub = scan.next();
        if(isSubstring(a,sub)) {
            for(int i=0;i<a.length();i++) {
                if(a.charAt(i) == sub.charAt(0)) {
                    for(int j = i + 1; j < a.length(); j++) {
                        if(a.substring(i,j).equals(sub)) {
                            System.out.println(j);
                        }
                    }
                }
            }
        }
        else {
            System.out.println(-1);
        }
        scan.close(); 
    }
}
