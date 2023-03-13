package week04;

import java.util.Scanner;
/*
    First, try to find if there is a case like: string[0] == sub[0]
    if yes, check until equivalance goes on.

    * string = a in this code
 */
public class P12 {
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
