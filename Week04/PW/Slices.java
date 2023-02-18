import java.util.Arrays;
import java.util.Scanner;

public class Slices {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String[] result = Slices(input);
        for(String s : result){
            System.out.println(s);
        }
        

    }
    

private static String[] Slices(String a){
    String [] res = new String[a.length()];
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<a.length(); i++){
       sb.append(a.substring(0, i)).append(" ").append(a.substring(i, a.length()));
       res[i]=sb.toString();
       sb.setLength(0);

    }
    return res;
}
}
