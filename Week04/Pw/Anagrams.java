import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word1= scan.nextLine();
        String word2= scan.nextLine();
        System.out.println("Are word1 and word2 anagrams? "+ checkAnagrams(word1, word2));



        
    }
    private static boolean checkAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;

        }
        char c1[]= s1.toCharArray();
        char c2[]= s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0; i<c1.length;i++){
            if(c1[i]!= c2[i]){
                return false;
            }
        }
        return true;
        
    }
}
