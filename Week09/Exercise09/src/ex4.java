import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {
        // a
        HashMap<String, List<String>> friendsMap = new HashMap<>();

        // b
        addPair(friendsMap, "Ali", "Ahmad");
        addPair(friendsMap, "Ali", "Islam");
        addPair(friendsMap, "Coshgun", "Ahmad");
        System.out.println(friendsMap);

        // c
        removePair(friendsMap, "Ali", "Islam");
        System.out.println(friendsMap);
    }

    public static void addPair(HashMap<String, List<String>> hm, String a, String b) {
        int cnt = 0;
        for (String x: hm.keySet()) {
            if (x.equals(a)) {
                hm.get(x).add(b);
                cnt++;
            }
        }
        if (cnt == 0) {
            List<String> l1 = new LinkedList<String>();
            l1.add(b);
            hm.put(a, l1);
        }

        cnt = 0;
        for (String x: hm.keySet()) {
            if (x.equals(b)) {
                hm.get(x).add(a);
                cnt++;
            }
        }
        if (cnt == 0) {
            List<String> l1 = new LinkedList<String>();
            l1.add(a);
            hm.put(b, l1);
        }
    }

    public static void removePair(HashMap<String, List<String>> hm, String a, String b) {
        for (String x: hm.keySet()) {
            if (x.equals(a)) {
                hm.get(x).remove(b);
            }
        }

        for (String x: hm.keySet()) {
            if (x.equals(b)) {
                hm.get(x).remove(a);
            }
        }
    }
}
