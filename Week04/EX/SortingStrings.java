import java.util.*;
public class SortingStrings {
    public static void main(String[] args) throws Exception {
        String alph= "JCADB";
        Sort(alph);

    }
    public static void Sort(String alph){
        char[] ch;
        StringBuilder st= new StringBuilder();
        ch= alph.toCharArray();
        Arrays.sort(ch);
        
        System.out.println(Arrays.toString(ch));

        
    }
}
