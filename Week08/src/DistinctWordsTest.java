import distinctwords.DistinctWords;
import java.util.*;

public class DistinctWordsTest {
    public static List<String> removeDuplicates(Collection<String> list) {
        List <String> distinctList = new  ArrayList<String>();
        for(String i: list) {
            if(!distinctList.contains(i)) {
                distinctList.add(i);
            }
        }
        return distinctList;
    }
    public static void main(String[] args) {
        Collection <String> list = DistinctWords.initCollection();
        
        // I
        List<String> uniqueList = removeDuplicates(list);
        System.out.println(uniqueList.toString());

        // II
        // Collections.sort(uniqueList);
        // System.out.println(uniqueList.toString());
        
    }
}
