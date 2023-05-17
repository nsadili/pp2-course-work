package Week04.pw;

import java.util.*;
public class Slices {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0;
        int n = s.length();
        String r = "";
        for (int i = 0; i < n; i++) {
            r+=' ';
        }
        for (int j = 0; j < n ; j++) {
            r = s.substring(0,j+1)+" "+s.substring(j+1,n);
            System.out.println(r);
        }}
}