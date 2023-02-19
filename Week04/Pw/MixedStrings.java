import java.util.Scanner;
public class MixedStrings {
    public static void main(String[] args) {
        
    Scanner scan= new Scanner(System.in);
    String sentence= scan.nextLine();
     
    System.out.println(swap(sentence));

        
    }
    private static String swap(String s){
    StringBuilder sb= new StringBuilder();
    String w[]= s.split(" ");
    for(String word :w){
        if(word.length()<=1){
            sb.append(word);
        } else{
            char c1= word.charAt(0); // First letter
            char c2= word.charAt(word.length()-1); // Last letter
            sb.append(c2).append(word.substring(1, word.length()-1)).append(c1); // swap first and last letter
        }
        sb.append(" ");
    }
    return sb.toString().trim();
    // trim()-trim() is a method of the String class that removes any leading or trailing whitespace from a string and returns a new string with the whitespace removed.




    }


}
    

