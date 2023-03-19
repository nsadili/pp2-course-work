package Week08;

import java.util.Comparator;

public class Comparators implements Comparator<String> {
    public int compare(String a1, String a2) {
        return a1.compareTo(a2);
    }
}
