import java.util.Arrays;

public class Anagrams {
    
    public static boolean Compare(String a, String b){
        char[] string1 = a.toCharArray();
        char[] string2 = b.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

       return Arrays.equals(string1, string2);
    }
    public class Main{
        public static void main(String[] args){
            String aa = "nijat";
            String bb = "tajin";
            
            System.out.println(Compare(aa, bb));

        }
    }
}
