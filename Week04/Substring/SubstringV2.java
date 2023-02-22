package Substring;

import java.util.Scanner;

public class SubstringV2 {
    public static int findIndex(String str, String sub) {
        char[] cstr = str.toCharArray();
        char[] csub = sub.toCharArray();
        for (int i = 0, count = 0; i < cstr.length-1; i++) {
            for (int j = 0, g = i; j < csub.length-1; j++, g++) {
                if(cstr[g] == csub[j]) count++;
            }
            if(csub.length == count) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String sub = sc.nextLine();
            System.out.println(findIndex(str, sub));
        }
        
    }
}
