package Week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Collection;

public class DistinctWords {
    public static void main(String[] args) {

        ArrayList<String> init = new ArrayList<>(initCollection());

        // Providing it to contain only unique elements
        LinkedHashSet<String> words = new LinkedHashSet<>(init);

        // Sorting
        List<String> list = new ArrayList<>(words);
        Collections.sort(list);

        // Printing
        System.out.println(list.toString());
    }

    static Collection<String> initCollection() {
        var collection = new ArrayList<String>();
        Collections.addAll(collection),
                "Daniel", "Davis", "Barbara", "Rivera", "Lori", "Patterson",
                "Theresa",  "Angela", "Taylor", "Jeremy",
                "Foster", "John", "Reed", "David", "Wilson", "Carolyn", "Coleman", "Stephanie", "Hughes", "Rose",
                "Robinson", "Shawn", "Edwards", "Cheryl", "Morris", "Benjamin", "Lopez", "Elizabeth", "Bennett",
                "Frances", "Roberts",  "Tammy", "Harris", "Moore",
                "Marilyn", "Anderson", "Ruby", "Campbell", "Christine", "Richardson", "Jean", "Rodriguez", "Jason",
                "Garcia", "Adams", "Kevin",  "Nancy", "Young", "Willie", "Brooks",
                

        return collection;
    }
}