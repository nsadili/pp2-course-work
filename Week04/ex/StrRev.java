import java.util.*;
public class StrRev {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);    
        String word= scan.nextLine();
        System.out.println(reverse1(word));
    }

    private static String reverse1(String str){ 
         String rev= "";
        for(int i=str.length()-1;i>=0;i--){
          rev +=str.charAt(i);
        }
        return rev;
       
    }
}
