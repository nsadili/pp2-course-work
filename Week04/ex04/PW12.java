import java.util.Scanner;

public class PW12 {
    public static boolean isSubstring(String b, String sub)
    {
        for(int i=0; i<b.length(); i++)
        {
            if(b.charAt(i)== sub.charAt(0))
            {
                for(int k=i+1; k<b.length(); k++) 
                {
                    if(b.substring(i,k).equals(sub))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String b= scan.next();
        String sub=scan.next();
        if(isSubstring(b,sub))
        {
            for(int i=0; i<b.length(); i++)
            {
                if(b.charAt(i)==sub.charAt(0))
                {
                    for (int k=i+1; k<b.length(); k++)
                    {
                        if(b.substring(i,k).equals(sub))
                        {
                            System.out.println(k);
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println(-1);
        }
        scan.close();
    }
}
