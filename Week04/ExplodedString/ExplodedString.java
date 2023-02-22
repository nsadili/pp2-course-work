package ExplodedString;

public class ExplodedString {
    public static String explode(String ss) {
        String s = "";
        char c[] = ss.toCharArray();

        int x = c.length;
        while(true) {
            for(int i = 0; i<c.length-x+1; i++)
            {
                s+=c[i];
            }
                
                x--;
                if(x==0) break;
        }
            return s;
    }
    public static void main(String[] args) {
        String s = "Baku";
        System.out.println(explode(s));
    }
}
