import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class PW11 {
        public static String swapChars(String b) {
        StringBuilder res=new StringBuilder("");
        res.append(b.charAt(b.length()-1));
        res.append(b.substring(1, b.length()-1));
        res.append(b.charAt(0));
        b=res.toString();
        return b;
    }
    public static String solve(String b){
        StringBuilder result=new StringBuilder("");
        StringBuilder builder=new StringBuilder("");
        int i=0;
        while(i<b.length())
        {
            if(! Character.isWhitespace(b.charAt(i))){
                builder.append(b.charAt(i));
            }
            else
            {
                result.append(swapChars(builder.toString())+ " ");
            }
            i++;
        }
        if (builder.toString().isEmpty())
        {
            result.append(swapChars(builder.toString())+" ");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner con=new Scanner (System.in);
        String b=con.nextLine();
        System.out.println(solve(b));
        con.close();
    }
}
