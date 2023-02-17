package Week4.String;
import java.lang.String;
public class Exploded {

    public static String reverse(String str){
        char ch;
        String nstr = "";
        for (int i=0; i<str.length(); i++){
        ch= str.charAt(i);      //extracts each character
        nstr= ch+nstr;          //adds each character in front of the existing string
      }
      return nstr;
    }

    public static void main(String args[]){
        String str = "Baku";
        
        for(int i=0; i<str.length(); i++){
            int j = i;
            while(j>=0){
            System.out.print(str.charAt(j));
            j--;
            }
            System.out.println();
        }
        
    }
}
