// To ensure that the order of the words is retained, we can use a HashSet to remove duplicates. However, HashSet does not preserve the order of elements,
//so we need to use a LinkedHashSet instead. Here's how we can modify the provided code to remove duplicates while retaining the order:

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class DistinctWords {
    public static void main(String[] args) {
        Collection<String> collection = initCollection();
        Collection<String> distinctWords = new ArrayList<>(new LinkedHashSet<>(collection));
        System.out.println(distinctWords);
    }

    static Collection<String> initCollection() {
        // code for initializing collection
    }
}

