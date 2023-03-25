package Week08.Ex4;

import java.util.*;

public class CollectionProcessingExample {
    public static void main(String[] args) {
        // create a collection of names
        Collection<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");
        names.add("Dave");
        names.add("Charlie");
        names.add("Eve");

        // create a set to hold the unique names in the order they appear
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>(names);

        // print the unique names in the order they appear
        System.out.println("Unique names in the order they appear: " + uniqueNames);

        // create a list from the set to sort the names
        List<String> sortedNames = new ArrayList<>(uniqueNames);

        // sort the list in alphabetical order
        Collections.sort(sortedNames);

        // print the sorted names
        System.out.println("Unique names sorted in alphabetical order: " + sortedNames);
    }
}
