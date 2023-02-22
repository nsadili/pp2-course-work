import java.lang.String;


public class ExplodedString {
    public static void main(String[] args){
        String str = new String(args[0]);
        StringBuilder strb = new StringBuilder();

        for(int i = 1; i <= str.length(); i++){
            for(int j = 0; j < i; j++){
                strb.append(str.charAt(j));
            }
        }

        System.out.println(strb);
    }
}
