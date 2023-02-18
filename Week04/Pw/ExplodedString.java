import java.util.Scanner;
public class ExplodedString {
    public static void main(String[] args) { 
        Scanner scn= new Scanner(System.in);
        String n= scn.next();
        
        System.out.println("Exploded string is: "+ explode(n));

    }

    private static String explode(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=1; i<=str.length();i++){
          for(int k=0;k<i;k++){
                char s= str.charAt(k);
              
               sb.append(s);

            }

            
        }
        return sb.toString();



    }
}
