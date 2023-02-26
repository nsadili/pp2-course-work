package week04;

import java.util.Scanner;

public class SubString {
    public static boolean isTrue(String string, String sub) {
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == sub.charAt(0)) {
                for(int j = i + 1; j < string.length(); j++) {
                    if(string.substring(i, j).equals(sub)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        String sub = scan.next();
        if(isTrue(string,sub)) {
            for(int i = 0; i<string.length(); i++) {
                if(string.charAt(i) == sub.charAt(0)) {
                    for(int j = i + 1; j < string.length(); j++) {
                        if(string.substring(i, j).equals(sub)) {
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
