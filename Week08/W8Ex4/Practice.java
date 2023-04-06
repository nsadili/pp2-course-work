package W8Ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Mikkey");
        names.add("Terry");
        names.add("Bobby"); 

        Set<String> uniqueNames = new LinkedHashSet<>(names);

        System.out.println("Original list: " + names);
        System.out.println("Duplicates: " + getDuplicates(names));
        System.out.println("Unique names: " + getSortedNames(uniqueNames));
    }

    public static List<String> getSortedNames(Set<String> names) {
        
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        return sortedNames;
    }

    public static List<String> getDuplicates(List<String> names) {
        
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    duplicates.add(names.get(i));
                    break;
                }
            }
        }

        return duplicates;
    }
}
