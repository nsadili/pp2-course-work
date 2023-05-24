import java.util.ArrayList;
import java.util.Collections;

public class ex6 {
    public static void main(String[] args) {
        String input=args[0].toLowerCase();
        ArrayList<String> list= new ArrayList<String>();
        char[] chars=input.toCharArray();
        
        for(int i=0;i<chars.length;i++){
          list.add(String.valueOf(chars[i]));    
        }
        Collections.sort(list);
          System.out.println("Non-descending order:");
          System.out.println(list);
          System.out.println("Non-ascending order:");
          Collections.sort(list, Collections.reverseOrder());
          System.out.println(list);
    }
}
