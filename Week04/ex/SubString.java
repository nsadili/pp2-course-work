import java.util.*;
public class SubString {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        String string= sc.next();
        String sub= sc.next();
        sc.close();
     System.out.println(string.indexOf(sub));  
    }
}
