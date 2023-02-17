import java.util.Scanner;
//import java.util.StringBuilder;

public class ExplodedString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int l=1;

        for(int i=0; i<input.length();i++)
      System.out.print(input.substring(0,l++));
      System.out.println();
      String explodedString = explodeString(input);
      System.out.println("Exploded string (II way): " + explodedString);
        }
      public static String  explodeString( String input){
StringBuilder sb = new StringBuilder();
for(int i=1; i<=input.length();i++){
    for(int j=0; j<i;j++)
    sb.append(input.charAt(j));
}
return sb.toString();
      }
    }

