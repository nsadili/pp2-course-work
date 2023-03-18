import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bonie");
        names.add("Jones");
        names.add("Ter");
        names.add("Jones"); // duplicate word
        
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println("Duplicates: " + uniqueNames);
        
        List<String> sortedNames = sortAlphabetically(uniqueNames);
        System.out.println("Alphabetic order: " + sortedNames);
    }
    
    public static List<String> sortAlphabetically(Set<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        return sortedNames;
    }
    //METHOD!
}
