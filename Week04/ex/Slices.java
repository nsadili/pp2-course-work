import java.util.*;
public class Slices {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String a = sc.next();

      if (a.length() == 0) {
          System.out.println("Please, enter a word");
          System.exit(0);
      }
      sc.close();
        
        slice(a);
    }
    public static void slice(String a){
    for(int i=1; i<a.length();i++){
    System.out.print(a.substring(0, i) +" "); 
    System.out.print(a.substring(i,a.length()));
    System.out.println();
    }
    }
}
