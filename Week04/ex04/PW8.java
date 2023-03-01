import java.util.Scanner;

public class PW8 {
    public static void main(String[] args) {
        Scanner con = new Scanner (System.in);
        String a= con.next();
        int n = a.length();
        StringBuilder res=new StringBuilder("");
        for (int i=0; i<n; i++)
        {
            for (int j=0; i<=i; j++){
                res.append(a.charAt(j));
            }
        }
        System.out.println(res);
        con.close();
    }
}
