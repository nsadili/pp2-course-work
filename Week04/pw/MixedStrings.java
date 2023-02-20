import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String sentence= sc.nextLine();
         
        System.out.println(swap(sentence));
    
            
        }
        private static String swap(String s){
        StringBuilder sb= new StringBuilder();
        String w[]= s.split(" ");
        for(String word :w){
            if(word.length()<=1){
                sb.append(word);
            } else{
                char c1= word.charAt(0); 
                char c2= word.charAt(word.length()-1); 
                sb.append(c2).append(word.substring(1, word.length()-1)).append(c1); 
            }
            sb.append(" ");
        }
        return sb.toString().trim();
      
    
    
    
    
        }
    
    
}
