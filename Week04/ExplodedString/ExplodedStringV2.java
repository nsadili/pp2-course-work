package ExplodedString;

import java.util.Scanner;

public class ExplodedStringV2 {
    
    public static String explode(String ss) {
        StringBuilder s = new StringBuilder();
        char c[] = ss.toCharArray();

        int x = c.length;
        while(true) {
            for(int i = 0; i<c.length-x+1; i++) s.append(c[i]);
            x--;
            if(x==0) break;
        }
            return s.toString();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            System.out.println(explode(s));
        }
    }
}


