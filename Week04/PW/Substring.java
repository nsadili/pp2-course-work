import java.util.Scanner;

public class Substring {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String st1= scan.next();
        String st2= scan.next();
        System.out.println(Sub(st1, st2));
        }


private static int Sub(String st, String subst){
    int n = st.length();
    int m = subst.length();
    for(int i=0;i<=n-m;i++){
        int j;
        for(j=0;j<m;j++){
            if (st.charAt(i+j)!=subst.charAt(j)) break;
        }
        if(j==m) return 1;
    }
    return -1;

    }

}
