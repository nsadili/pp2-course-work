import java.util.Arrays;
public class Anagrams {
    public boolean areAnagrams(String n1, String n2) {
        if (n1.length() != n2.length()) {
            return false;
        }
    
        char[] chars1 = n1.toCharArray();
        char[] chars2 = n2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
    
      
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
    
        return true;
    }
    public static void main(String[] args) {
        String n1 = "race" ;
        String n2 = "care" ;
        Anagrams x = new Anagrams() ;
        System.out.println(x.areAnagrams(n1, n2));
    }
    }
  
