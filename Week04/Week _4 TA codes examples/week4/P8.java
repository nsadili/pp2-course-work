package week04;

import java.util.Scanner;
/*
i = row
j = column

  0 1 2 3
0 B
1 B a
2 B a k
3 B a k u

i = 0...n-1 => j = 0...i everytime append j-th character and it will work
 */
public class P8 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String a = con.next();
        int n = a.length();
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                res.append(a.charAt(j));
            }
        }
        System.out.println(res);
        con.close();
    }
}
