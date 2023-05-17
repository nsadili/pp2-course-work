package Main;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main5 {
    public static void main(String[] args) {
        HashSet<String> hs = new LinkedHashSet<>();
        hs.add("A");
        hs.add("C");
        hs.add("C");
        hs.add("B");

        System.out.println(hs);
    }
}
