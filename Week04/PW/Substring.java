import java.util.Scanner;

public class Substring {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String string=scn.nextLine();
        String sub=scn.nextLine();
        Sub(string,sub);
    }
    public static void Sub(String string, String sub){
        
        int i=string.indexOf(sub);
        if(i==1) System.out.println(-1); else System.out.println(i);
    }
}
